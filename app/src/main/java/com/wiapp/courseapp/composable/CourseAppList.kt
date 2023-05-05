package com.wiapp.courseapp.composable

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import com.wiapp.courseapp.model.CategoryDatas

@Composable
fun CourseAppList(categoryDatas: List<CategoryDatas>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2)
    ){
        items(categoryDatas){
            categoryDatas ->
            CourseAppCard(categoryDatas)
        }
    }
}