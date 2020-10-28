package com.zkq.zkqbaselib.module.robhongbao.callback;

import com.zkq.zkqbaselib.base.BaseView;
import com.zkq.zkqbaselib.ibean.IUserGrades;

import java.util.List;

public interface RobHong_Guize_CallBack   extends BaseView {

    void userGrades_Success(List<IUserGrades> list);
}
