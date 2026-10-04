package com.orion.notein.p607ui.noteeditor.audio.dialog;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o0OoO000.o00Oo0;
import o0OoOo0O.ViewOnClickListenerC29207OooO00o;
import o0OoOo0O.ViewOnClickListenerC29208OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/audio/dialog/AudioFileRenameDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AudioFileRenameDialogFragment extends Hilt_AudioFileRenameDialogFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public EditText f74420Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public View f74421Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f74422Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f74423Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public String f74424Oooo0O0 = "";

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public OooO00o f74425Oooo0OO;

    public interface OooO00o {
        void OooO00o(String str);
    }

    public static final class OooO0O0 implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static final class OooO0OO implements TextWatcher {
        public OooO0OO() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (charSequence == null) {
                charSequence = "";
            }
            AudioFileRenameDialogFragment audioFileRenameDialogFragment = AudioFileRenameDialogFragment.this;
            View view = audioFileRenameDialogFragment.f74422Oooo00O;
            if (view == null) {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
            view.setEnabled(charSequence.length() > 0);
            View view2 = audioFileRenameDialogFragment.f74423Oooo00o;
            if (view2 != null) {
                view2.setVisibility(charSequence.length() > 0 ? 0 : 8);
            } else {
                OooOOO0.OooOOOO("btnClear");
                throw null;
            }
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_audio_file_rename_dialog;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        EditText editText = (EditText) view.findViewById(R.id.input_name);
        this.f74420Oooo0 = editText;
        if (editText == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText.setHorizontallyScrolling(false);
        EditText editText2 = this.f74420Oooo0;
        if (editText2 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText2.setMaxLines(Integer.MAX_VALUE);
        EditText editText3 = this.f74420Oooo0;
        if (editText3 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText3.addTextChangedListener(new OooO0O0());
        EditText editText4 = this.f74420Oooo0;
        if (editText4 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText4.addTextChangedListener(new OooO0OO());
        EditText editText5 = this.f74420Oooo0;
        if (editText5 == null) {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
        editText5.requestFocus();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setSoftInputMode(4);
        }
        View viewFindViewById = view.findViewById(R.id.btn_clear);
        this.f74423Oooo00o = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnClear");
            throw null;
        }
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC29207OooO00o(this, 0));
        View viewFindViewById2 = view.findViewById(R.id.btn_cancel);
        this.f74421Oooo000 = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC29208OooO0O0(this, 0));
        View viewFindViewById3 = view.findViewById(R.id.btn_confirm);
        this.f74422Oooo00O = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        viewFindViewById3.setOnClickListener(new o00Oo0(this, 1));
        EditText editText6 = this.f74420Oooo0;
        if (editText6 != null) {
            editText6.setHint(this.f74424Oooo0O0);
        } else {
            OooOOO0.OooOOOO("inputName");
            throw null;
        }
    }
}
