package com.qqy.lmdg.module.robhongbao.callback;

import com.qqy.lmdg.api.entry.EntryResult;
import com.qqy.lmdg.base.BaseView;
import com.qqy.lmdg.common.ibean.IUser_redpack_list;
import com.qqy.lmdg.home.model.DrawLogList;

import java.util.List;

public interface  RobHong_Jiangjin_CallBack  extends BaseView {

    void user_redpack_list_Success(List<IUser_redpack_list> iUser_redpack_list);
    void loadBonusSuccess(List<DrawLogList> list);

    void drawGeResult(EntryResult result);

    void user_redpack_activeBatch_Success();
}
