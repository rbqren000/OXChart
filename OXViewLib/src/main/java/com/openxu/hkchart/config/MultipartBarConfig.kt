package com.openxu.hkchart.config

import android.content.Context
import android.graphics.Color
import com.openxu.utils.DensityUtil

/**
 * Author: openXu
 * Time: 2021/5/9 12:14
 * class: MultipartBarConfig
 * Description:
 */
class MultipartBarConfig(context: Context) : ChartConfigBase(){

    //默认柱宽度15dp
    var barWidth = DensityUtil.dip2px(context, 15f).toFloat()
    //默认柱间的间距占比，间距 = barWidth*spacingRatio
    var spacingRatio = 1f
    //只读，根据柱体宽度 和 间距占比获取间距
    val barSpace : Float
        get() {return barWidth * spacingRatio }

    //柱颜色
    var barColor: IntArray = intArrayOf(
            Color.parseColor("#f46763"),
            Color.parseColor("#3cd595"),
            Color.parseColor("#4d7bff"))
}
/**
 * Author: openXu
 * Time: 2021/5/9 12:14
 * class: MultipartBarData
 * Description: 数据
 */
class MultipartBarData(val valuey: List<Float>, val valuex: String)