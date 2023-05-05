package com.wiapp.courseapp.composable

import androidx.compose.runtime.Composable
import com.wiapp.courseapp.data.DataSources

@Composable
fun CourseAppHome(){
    CourseAppList(categoryDatas = DataSources().loadDataSources())
}