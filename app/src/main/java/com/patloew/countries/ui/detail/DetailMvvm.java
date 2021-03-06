package com.patloew.countries.ui.detail;

import com.patloew.countries.ui.base.view.MvvmView;
import com.patloew.countries.ui.main.recyclerview.CountryMvvm;

/* Copyright 2016 Patrick Löwenstein
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. */
public interface DetailMvvm {

    interface View extends MvvmView {

    }

    interface ViewModel extends CountryMvvm.ViewModel<View> {
        // Properties
        boolean getDetailVisibility();
        CharSequence getNameTranslations();
        CharSequence getLanguages();
        CharSequence getCurrencies();
        int getBorderVisibility();
        CharSequence getBorders();
    }
}
