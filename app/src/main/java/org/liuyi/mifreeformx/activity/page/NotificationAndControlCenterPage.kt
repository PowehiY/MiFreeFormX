package org.liuyi.mifreeformx.activity.page

import android.annotation.SuppressLint
import cn.fkj233.ui.activity.annotation.BMPage
import cn.fkj233.ui.activity.view.TextSummaryV
import org.liuyi.mifreeformx.BlackList
import org.liuyi.mifreeformx.DataConst
import org.liuyi.mifreeformx.R

/**
 * @Author: Liuyi
 * @Date: 2023/04/21/19:45:22
 * @Description:
 */
@SuppressLint("NonConstantResourceId")
@BMPage("NotificationAndControlCenterPage", titleId = R.string.notification_and_controlcenter)
class NotificationAndControlCenterPage : MyBasePage() {
    override fun onCreate() {
        TitleText(textId = R.string.notification)
        TextSummaryWithSwitch(
            TextSummaryV(
                textId = R.string.click_notice_open_widow,
                tipsId = R.string.click_notice_open_widow_tips
            ),
            createSwitchV(DataConst.OPEN_NOTICE)
        )
        TextSummaryWithSwitch(
            TextSummaryV(
                textId = R.string.remove_window_notice_limit,
                tipsId = R.string.remove_window_notice_limit_tips
            ),
            createSwitchV(DataConst.NOTIFY_LIMIT_REMOVE_SMALL_WINDOW)
        )

        Line()
        TitleText(textId = R.string.control_center)
        TextSummaryWithSwitch(
            TextSummaryV(
                textId = R.string.long_press_tile_open_window,
                tipsId = R.string.long_press_tile_open_window_tips
            ),
            createSwitchV(DataConst.LONG_PRESS_TILE)
        )
        TextSummaryWithSwitch(
            TextSummaryV(
                textId = R.string.force_all_tile_use_widow,
                tipsId = R.string.force_all_tile_use_widow_tips,
            ),
            createSwitchV(DataConst.FORCE_CONTROL_ALL_OPEN)
        )
        TextSummaryWithArrow(TextSummaryV(text = "黑名单") {
            AppSelectPage.currentBlackList = BlackList.TileBlacklist
            showFragment("AppSelectPage")
        })

    }
}