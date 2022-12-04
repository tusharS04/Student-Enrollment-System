import * as React from 'react';
import { AppBar, Typography, Box, Toolbar } from '@material-ui/core';
import MenuIcon from '@mui/icons-material/Menu';
import {IconButton} from '@material-ui/core';
export default function Appbar() {
  return (
    <Box sx={{ flexGrow: 1 }}>
      <AppBar position="static">
        <Toolbar variant="dense">
          <IconButton edge="start" color="inherit" aria-label="menu" sx={{ mr: 2 }}>
          <MenuIcon></MenuIcon>
          </IconButton>
           
          <Typography variant="h6" color="inherit" component="div"> 
            Spring Boot React
          </Typography>
        </Toolbar>
      </AppBar>
    </Box>
  );
}
