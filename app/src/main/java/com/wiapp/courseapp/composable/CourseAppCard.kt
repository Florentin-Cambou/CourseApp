package com.wiapp.courseapp.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wiapp.courseapp.R
import com.wiapp.courseapp.model.CategoryDatas

@Composable

fun CourseAppCard(categoryDatas: CategoryDatas) {
    Card(modifier = Modifier
        .padding(10.dp),
        elevation = CardDefaults.cardElevation(8.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Row() {
            Image(
                painter = painterResource(id = categoryDatas.imgCategory),
                contentDescription = null,
                Modifier.size(75.dp)
            )

            Row() {
                Column(modifier = Modifier.padding(15.dp)) {
                    Text(
                        text = stringResource(id = categoryDatas.titleCategory),
                        style = TextStyle(fontSize = 14.sp),
                        modifier = Modifier.padding(bottom = 10.dp)
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_grain),
                            contentDescription = null,
                            alignment = Alignment.BottomStart,
                            modifier = Modifier.size(15.dp)
                        )
                        Text(
                            modifier = Modifier.padding(start = 5.dp),
                            style = TextStyle(fontSize = 12.sp),
                            text = "${categoryDatas.nbCourses}"
                        )
                    }
                }
            }
        }
    }
}