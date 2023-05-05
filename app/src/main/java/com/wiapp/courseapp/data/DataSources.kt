package com.wiapp.courseapp.data

import com.wiapp.courseapp.R
import com.wiapp.courseapp.model.CategoryDatas

class DataSources {
    fun loadDataSources(): List<CategoryDatas>{
        return listOf<CategoryDatas>(
            CategoryDatas(R.string.course_1,R.drawable.architecture,10),
            CategoryDatas(R.string.course_2,R.drawable.business,20),
            CategoryDatas(R.string.course_3,R.drawable.crafts,30),
            CategoryDatas(R.string.course_4,R.drawable.culinary,40),
            CategoryDatas(R.string.course_5,R.drawable.design,50),
            CategoryDatas(R.string.course_6,R.drawable.drawing,60),
            CategoryDatas(R.string.course_7,R.drawable.fashion,70),
            CategoryDatas(R.string.course_8,R.drawable.film,80),
            CategoryDatas(R.string.course_9,R.drawable.gaming,90),
            CategoryDatas(R.string.course_10,R.drawable.lifestyle,100),
            CategoryDatas(R.string.course_11,R.drawable.music,110),
            CategoryDatas(R.string.course_12,R.drawable.painting,120),
            CategoryDatas(R.string.course_13,R.drawable.photography,130),
            CategoryDatas(R.string.course_14,R.drawable.tech,140),

        )
    }
}