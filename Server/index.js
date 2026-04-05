// Import necessary modules
//import { useNavigate } from 'react-router-dom';
const express = require('express');
const nodemailer = require('nodemailer');
const crypto = require('crypto');
const bodyParser = require('body-parser');
const cors = require('cors');
const app = express();
app.use(bodyParser.json());
app.use(cors());

// Dummy in-memory store for user data
let users = {};

// Nodemailer transporter setup
const transporter = nodemailer.createTransport({
  service: 'Gmail',
  host: "smtp.gmail.com",
  port: 465,
  secure: true,
  auth: {
    user: 'ivalscare@gmail.com',
    pass: 'rdsehgqjiyvbujxn',
  }
});
//const navigate = useNavigate();
// Endpoint for receiving email notification request
app.post('/notify', (req, res) => {
  const { email } = req.body;

  // Create verification token
  const verificationToken = crypto.randomBytes(32).toString('hex');

  // Store user data - Assuming you want to store the email for verification
  users[email] = { email, verificationToken, verified: false };

  // Send verification email
  const verificationUrl = `http://localhost:3000/verify-email?token=${verificationToken}&email=${email}`;

  const mailOptions = {
    from: 'ivalscare@gmail.com',
    to: email,
    subject: 'Email Verification',
    text: `Please verify your email by clicking the following link: ${verificationUrl}`
  };

  transporter.sendMail(mailOptions, (error, info) => {
    if (error) {
      return res.status(500).send(error.toString());
    }
    res.status(200).send('Signup successful. Please check your email to verify your account.');
  });
});

// Endpoint for email verification
app.get('/verify-email', (req, res) => {
  const { token, email } = req.query;

  if (users[email] && users[email].verificationToken === token) {
    users[email].verified = true;
   // navigate('/login')
    res.json({ navigateTo: '/login' });
    res.send('Email verified successfully!');
   
  } else {
    res.status(400).send('Invalid verification link.');
  }
});

// Start server
app.listen(9090, () => {
  console.log('Server is running on port 9090');
});
