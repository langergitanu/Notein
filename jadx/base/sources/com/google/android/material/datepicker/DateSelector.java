package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.util.Pair;
import com.google.android.material.internal.ViewUtils;
import java.text.SimpleDateFormat;
import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public interface DateSelector<S> extends Parcelable {
    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$showKeyboardWithAutoHideBehavior$0(EditText[] editTextArr, View view, boolean z) {
        for (EditText editText : editTextArr) {
            if (editText.hasFocus()) {
                return;
            }
        }
        ViewUtils.hideKeyboard(view, false);
    }

    static void showKeyboardWithAutoHideBehavior(EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        OooO0OO oooO0OO = new OooO0OO(editTextArr, 0);
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(oooO0OO);
        }
        EditText editText2 = editTextArr[0];
        editText2.postDelayed(new RunnableC22468OooO0Oo(editText2, 0), 100L);
    }

    int getDefaultThemeResId(Context context);

    int getDefaultTitleResId();

    String getError();

    Collection<Long> getSelectedDays();

    Collection<Pair<Long, Long>> getSelectedRanges();

    S getSelection();

    String getSelectionContentDescription(Context context);

    String getSelectionDisplayString(Context context);

    boolean isSelectionComplete();

    View onCreateTextInputView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, OnSelectionChangedListener<S> onSelectionChangedListener);

    void select(long j);

    void setSelection(S s);

    void setTextInputFormat(SimpleDateFormat simpleDateFormat);
}
