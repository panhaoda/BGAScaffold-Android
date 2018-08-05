/**
 * Copyright 2018 bingoogolapple
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.bingoogolapple.scaffold.mvp

import android.support.annotation.StringRes

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:05/08/2018 7:16 PM
 * 描述:
 */
interface IMvpView<out Presenter : IPresenter<IMvpView<Presenter>>> : ILifecycle {
    val mPresenter: Presenter

    abstract fun shortToast(@StringRes resId: Int, vararg formatArgs: Any)

    abstract fun shortToast(content: CharSequence)

    abstract fun showProgressDialog(@StringRes resId: Int, cancelAble: Boolean)

    abstract fun dismissProgressDialog()
}