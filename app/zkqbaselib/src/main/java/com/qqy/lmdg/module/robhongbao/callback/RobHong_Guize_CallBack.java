package com.qqy.lmdg.module.robhongbao.callback;

import com.qqy.lmdg.base.BaseView;
import com.qqy.lmdg.ibean.IUserGrades;

import java.util.List;

public interface RobHong_Guize_CallBack   extends BaseView {

    void userGrades_Success(List<IUserGrades> list);
}
