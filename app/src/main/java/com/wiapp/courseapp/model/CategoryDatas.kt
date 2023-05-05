package com.wiapp.courseapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CategoryDatas(@StringRes val titleCategory: Int, @DrawableRes val imgCategory:Int,val nbCourses: Int)
