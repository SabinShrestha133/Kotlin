//package com.example.kotlinclass
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.BorderStroke
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.layout.width
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.KeyboardArrowDown
//import androidx.compose.material.icons.filled.KeyboardArrowLeft
//import androidx.compose.material.icons.filled.KeyboardArrowRight
//import androidx.compose.material3.Button
//import androidx.compose.material3.ButtonDefaults
//import androidx.compose.material3.Icon
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.alpha
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.font.FontStyle
//import androidx.compose.ui.text.font.FontWeight
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//
//class LoginActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//
//        setContent {
//            Scaffold {innerPadding->
//                InstaClone(innerPadding)
//
//            }
//        }
//    }
//}
//
//
//@Composable
//fun InstaClone(innerPadding : PaddingValues) {
//    Column(
//        modifier =
//            Modifier
//                .padding(innerPadding)
//                .fillMaxSize()
//                .background(color = Color.White)
//    ) {
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceBetween,
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 20.dp, vertical = 20.dp)
//        )
//
//        {
//            Icon(
//                imageVector = Icons.Default.KeyboardArrowLeft,
//                contentDescription = null,
//                modifier = Modifier.height(30.dp).width(30.dp)
//            )
//
//            Text(
//                text = "Sydney",
//                style = TextStyle(
//                    fontSize = 25.sp,
//                    fontWeight = FontWeight.Bold,
////                    fontStyle = FontStyle.Italic,
//                    textAlign = TextAlign.Center
//                )
//            )
//
//            Icon(
//                painterResource(R.drawable.baseline_more_horiz_24),
//                contentDescription = null,
//                modifier = Modifier.height(30.dp).width(30.dp)
//            )
//        }
//
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceBetween,
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 20.dp, vertical = 20.dp)
//        ) {
//            Image(
//                painter = painterResource(R.drawable.andrew),
//                contentDescription = null,
//                contentScale = ContentScale.Crop,
//                modifier = Modifier.
//                height(120.dp).width(120.dp).
//                clip(shape = RoundedCornerShape(100.dp))
//            )
////            Column {
////                Text(text = "537",style = TextStyle(
////                        fontSize = 20.sp,
////                    fontWeight = FontWeight.Bold,
//////                    fontStyle = FontStyle.Italic,
////                    textAlign = TextAlign.Center))
////                Text(text = "Posts",style = TextStyle(
////                        fontSize = 15.sp,
////                    fontWeight = FontWeight.Bold,
//////                    fontStyle = FontStyle.Italic,
////                    textAlign = TextAlign.Center))
////            }
////            Column {
////                Text(text = "24.7M",style = TextStyle(
////                    fontSize = 20.sp,
////                    fontWeight = FontWeight.Bold,
//////                    fontStyle = FontStyle.Italic,
////                    textAlign = TextAlign.Center))
////                Text(text = "Followers",style = TextStyle(
////                    fontSize = 15.sp,
////                    fontWeight = FontWeight.Bold,
//////                    fontStyle = FontStyle.Italic,
////                    textAlign = TextAlign.Center))
////            }
////            Column {
////                Text(text = "835",style = TextStyle(
////                    fontSize = 20.sp,
////                    fontWeight = FontWeight.Bold,
//////                    fontStyle = FontStyle.Italic,
////                    textAlign = TextAlign.Center))
////                Text(text = "Following",style = TextStyle(
////                    fontSize = 15.sp,
////                    fontWeight = FontWeight.Bold,
//////                    fontStyle = FontStyle.Italic,
////                    textAlign = TextAlign.Center))
//            Column(
//
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Text(text = "537",style = TextStyle(
//                    fontSize = 20.sp,
//                    fontWeight = FontWeight.Bold,
////                    fontStyle = FontStyle.Italic,
//                    textAlign = TextAlign.Center))
//                Text(text = "Posts",style = TextStyle(
//                    fontSize = 15.sp,
//                    fontWeight = FontWeight.Bold,
////                    fontStyle = FontStyle.Italic,
//                    textAlign = TextAlign.Center))
//            }
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Text(text = "24.7M",style = TextStyle(
//                    fontSize = 20.sp,
//                    fontWeight = FontWeight.Bold,
////                    fontStyle = FontStyle.Italic,
//                    textAlign = TextAlign.Center))
//                Text(text = "Followers",style = TextStyle(
//                    fontSize = 15.sp,
//                    fontWeight = FontWeight.Bold,
////                    fontStyle = FontStyle.Italic,
//                    textAlign = TextAlign.Center))
//            }
//            Column(
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Text(text = "835",style = TextStyle(
//                    fontSize = 20.sp,
//                    fontWeight = FontWeight.Bold,
////                    fontStyle = FontStyle.Italic,
//                    textAlign = TextAlign.Center))
//                Text(text = "Following",style = TextStyle(
//                    fontSize = 15.sp,
//                    fontWeight = FontWeight.Bold,
////                    fontStyle = FontStyle.Italic,
//                    textAlign = TextAlign.Center))
//            }
//        }
//
//
//        Column(
//            modifier = Modifier.padding(
//                horizontal = 15.dp,
////                vertical = 5.dp
//            )
//        ) {
//            Text("Sydney Sweeney", style = TextStyle(
//                fontWeight = FontWeight.Bold, color = Color.Black))
//            Text("\uD83D\uDC36", modifier = Modifier.alpha(alpha = 0.5f))
//            Text("Followed by sushmitaa._, aayush._16 and 23 more",
//                style = TextStyle(
//                    fontSize = 15.sp,
//                    fontWeight = FontWeight.Bold,
////              fontStyle = FontStyle.Italic,
//                    textAlign = TextAlign.Center))
//        }
//
//        Row(verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.SpaceBetween,
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 15.dp, vertical = 10.dp))
//        {
//            Button(onClick = {
//                // tdo when button clicked
//            },
//                shape = RoundedCornerShape(8.dp),
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = Color.Blue,
//                    contentColor = Color.White
//                )
//            )
//            { Text(text = "Follow") }
//
//            Button(onClick = {
//                // tdo when button clicked
//            },
//                shape = RoundedCornerShape(8.dp),
//                border = BorderStroke(1.dp, Color.Gray),
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = Color.White,
//                    contentColor = Color.Black
//                )
//            )
//            { Text(text = "Message") }
//
//            Button(onClick = {
//                // tdo when button clicked
//            },
//                shape = RoundedCornerShape(8.dp),
//                border = BorderStroke(1.dp, Color.Gray),
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = Color.White,
//                    contentColor = Color.Black
//                )
//            )
//            { Text(text = "Email") }
//
//            Button(onClick = {
//                // tdo when button clicked
//            },
//                shape = RoundedCornerShape(8.dp),
//                border = BorderStroke(1.dp, Color.Gray),
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = Color.White,
//                    contentColor = Color.Black
//                )
//            )
//            { Icon(Icons.Default.KeyboardArrowDown,
//                contentDescription = null) }
//        }
//
//    }
//}
//
//@Preview(showBackground = true)
//@Composable
//fun PreviewInsta(){
//    InstaClone(innerPadding = PaddingValues(0.dp))
//}