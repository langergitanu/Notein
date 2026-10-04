package o0o000oo;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.settings.GlobalSettingsContainerDialogFragment;
import java.util.Collections;
import java.util.List;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oo.C28755o00000o0;
import o0OoO0oo.C28792o000OOo;
import o0OoO0oo.C28982oo0o0Oo;
import o0o00OOo.InterfaceC29892OooO0oO;
import o0o00Oo0.C29909OooO0O0;
import oO00ooO.InterfaceC32440OooOO0;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0o000oo.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29825OooOoO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ BaseToolbarChildFragment f105810OooO00o;

    public C29825OooOoO0(BaseToolbarChildFragment baseToolbarChildFragment) {
        this.f105810OooO00o = baseToolbarChildFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO00o(View v) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105810OooO00o;
        InterfaceC32440OooOO0 interfaceC32440OooOO0 = (InterfaceC32440OooOO0) baseToolbarChildFragment.f76496OoooOO0.get(1);
        Object value = interfaceC32440OooOO0 != null ? interfaceC32440OooOO0.getValue() : null;
        InterfaceC29892OooO0oO interfaceC29892OooO0oO = value instanceof InterfaceC29892OooO0oO ? (InterfaceC29892OooO0oO) value : null;
        switch (v.getId()) {
            case R.id.cl_config_page /* 2131297065 */:
                baseToolbarChildFragment.OoooO(v, true);
                break;
            case R.id.cl_data_sync /* 2131297072 */:
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(baseToolbarChildFragment.Oooo0O0()), null, null, new C29830OooOooo(baseToolbarChildFragment, null), 3);
                break;
            case R.id.cl_export_docs /* 2131297090 */:
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(baseToolbarChildFragment.Oooo0O0()), null, null, new C29833Oooo000(v, baseToolbarChildFragment, null), 3);
                break;
            case R.id.cl_insert_page /* 2131297125 */:
                if (interfaceC29892OooO0oO != null) {
                    interfaceC29892OooO0oO.OooO00o();
                }
                baseToolbarChildFragment.Oooo();
                break;
            case R.id.cl_lock_note /* 2131297133 */:
                if (interfaceC29892OooO0oO != null) {
                    interfaceC29892OooO0oO.OooO00o();
                }
                NoteMeta noteMeta = (NoteMeta) baseToolbarChildFragment.Oooo0oo().f105932OooOOO.f121747OooOo0o.getValue();
                if (!(noteMeta != null ? noteMeta.getLockAdded() : false)) {
                    C28755o00000o0 c28755o00000o0 = baseToolbarChildFragment.f76506o000oOoO;
                    if (c28755o00000o0 != null) {
                        NoteEditorContainerFragment noteEditorContainerFragment = c28755o00000o0.f101844OooO00o;
                        C33609OooO0oo.OooO0OO(C28982oo0o0Oo.OooO00o(noteEditorContainerFragment, "getViewLifecycleOwner(...)"), null, null, new C28792o000OOo(noteEditorContainerFragment, null), 3);
                    }
                } else {
                    C28755o00000o0 c28755o00000o02 = baseToolbarChildFragment.f76506o000oOoO;
                    if (c28755o00000o02 != null) {
                        c28755o00000o02.OooO0OO();
                    }
                }
                break;
            case R.id.cl_page_padding /* 2131297154 */:
                if (interfaceC29892OooO0oO != null) {
                    interfaceC29892OooO0oO.OooO00o();
                }
                baseToolbarChildFragment.OoooOO0();
                break;
            case R.id.cl_page_rotate /* 2131297155 */:
                baseToolbarChildFragment.Ooooo0o();
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(baseToolbarChildFragment.Oooo0O0()), null, null, new C29835Oooo00o(v, baseToolbarChildFragment, null), 3);
                break;
            case R.id.cl_reading_mode /* 2131297178 */:
                if (interfaceC29892OooO0oO != null) {
                    interfaceC29892OooO0oO.OooO00o();
                }
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(baseToolbarChildFragment.Oooo0O0()), null, null, new C29837Oooo0OO(baseToolbarChildFragment, null), 3);
                break;
            case R.id.cl_settings /* 2131297197 */:
                if (interfaceC29892OooO0oO != null) {
                    interfaceC29892OooO0oO.OooO00o();
                }
                C28755o00000o0 c28755o00000o03 = baseToolbarChildFragment.f76506o000oOoO;
                if (c28755o00000o03 != null) {
                    NoteEditorContainerFragment noteEditorContainerFragment2 = c28755o00000o03.f101844OooO00o;
                    if (!noteEditorContainerFragment2.getResources().getBoolean(R.bool.use_settings_bottom_sheet)) {
                        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteEditorContainerFragment2), new C24564OooO00o(R.id.f57953x9d8972bd));
                    } else if (noteEditorContainerFragment2.getChildFragmentManager().OooOooo("globalSettingsContainerDialogFragment") == null) {
                        new GlobalSettingsContainerDialogFragment().show(noteEditorContainerFragment2.getChildFragmentManager(), "globalSettingsContainerDialogFragment");
                    }
                }
                break;
            case R.id.cl_writing_mode /* 2131297245 */:
                if (interfaceC29892OooO0oO != null) {
                    interfaceC29892OooO0oO.OooO00o();
                }
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(baseToolbarChildFragment.Oooo0O0()), null, null, new C29838Oooo0o(baseToolbarChildFragment, null), 3);
                break;
        }
    }

    public final void OooO0O0(C29909OooO0O0 c29909OooO0O0, Integer num, int i, boolean z) {
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105810OooO00o;
        if (z) {
            o00Ooo o00oooOooo0oo = baseToolbarChildFragment.Oooo0oo();
            C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(o00oooOooo0oo), null, null, new C29859OoooooO(o00oooOooo0oo, i, c29909OooO0O0.f106118OooO00o, null), 3);
            return;
        }
        if (num == null) {
            return;
        }
        List list = (List) baseToolbarChildFragment.Oooo0oo().f105942OooOo0o.f121747OooOo0o.getValue();
        if (num.intValue() < i) {
            int iIntValue = num.intValue();
            while (iIntValue < i) {
                int i2 = iIntValue + 1;
                Collections.swap(list, iIntValue, i2);
                iIntValue = i2;
            }
            return;
        }
        int iIntValue2 = num.intValue();
        int i3 = i + 1;
        if (i3 > iIntValue2) {
            return;
        }
        while (true) {
            Collections.swap(list, iIntValue2, iIntValue2 - 1);
            if (iIntValue2 == i3) {
                return;
            } else {
                iIntValue2--;
            }
        }
    }

    public final void OooO0OO(boolean z) {
        this.f105810OooO00o.Oooo00o().setActivated(z);
    }
}
