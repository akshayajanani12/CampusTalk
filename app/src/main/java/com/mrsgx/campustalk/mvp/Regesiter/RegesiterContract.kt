package com.mrsgx.campustalk.mvp.Regesiter

import com.mrsgx.campustalk.mvp.BasePresenter
import com.mrsgx.campustalk.mvp.BaseView
import com.mrsgx.campustalk.obj.CTUser

/**
 * Created by Shao on 2017/9/18.
 */
class RegesiterContract {
    interface View:BaseView<Presenter>{
        fun setEmailBoxState(b:Boolean)
    }
    interface Presenter:BasePresenter{
        fun CheckEmail(email:String)
        fun getCode()
        fun RegAccount(user:CTUser,code:String)
    }
}