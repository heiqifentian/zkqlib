package com.qqy.lmdg.base;

import androidx.annotation.StringRes;

/**
 * 基础View接口
 */
public interface BaseView {

  /**
   * 初始化
   */
  void initView();

  /*
   *  显示加载对话框
   * */
  void showLoadingDialog();

  /*
   * 隐藏加载对话框
   * */
  void cancelLoadingDialog();

  /**
   * 显示异常信息
   */
  void showError();

  /**
   * 显示提示信息
   */
  void showToast(String msg);

  /**
   * 显示提示信息
   */
  void showToast(@StringRes int res);
}