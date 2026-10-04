package o0o000oo;

import Oooo0oO.C21111o0ooOoO;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentManager;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.noteeditor.audio.C23419OooO0oO;
import com.orion.notein.p607ui.noteeditor.audio.dialog.AudioFileRenameDialogFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o0000oOO.AbstractC24338OooO0o0;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0OoOOo.C29155OooOooO;
import o0OoOOo.C29165Oooo0oo;
import o0OoOOo.C29171OoooOOO;
import o0OoOo.C29196OooO0OO;
import o0OoOo.C29197OooO0Oo;
import o0ooOOoo.InterfaceC31656OooO0O0;
import o0ooOOoo.InterfaceC31661OooO0oO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o000oo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29818OooOOoo implements InterfaceC31656OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ BaseToolbarChildFragment f105795OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC31661OooO0oO f105796OooO0O0;

    public C29818OooOOoo(BaseToolbarChildFragment baseToolbarChildFragment, InterfaceC31661OooO0oO interfaceC31661OooO0oO) {
        this.f105795OooO00o = baseToolbarChildFragment;
        this.f105796OooO0O0 = interfaceC31661OooO0oO;
    }

    @Override // o0ooOOoo.InterfaceC31656OooO0O0
    public final void OooO() {
        com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooo000 = this.f105795OooO00o.Oooo000();
        C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(oooO0oOooo000), null, null, new o0OoOOo.o000oOoO(oooO0oOooo000, null), 3);
    }

    @Override // o0ooOOoo.InterfaceC31656OooO0O0
    public final void OooO00o(C29196OooO0OO c29196OooO0OO) {
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105795OooO00o;
        FragmentManager childFragmentManager = baseToolbarChildFragment.getChildFragmentManager();
        kotlin.jvm.internal.OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
        if (childFragmentManager.OooOooo("AudioFileRenameDialogFragment") == null) {
            AudioFileRenameDialogFragment audioFileRenameDialogFragment = new AudioFileRenameDialogFragment();
            String str = c29196OooO0OO.f103557OooO0O0;
            if (str == null) {
                str = "";
            }
            audioFileRenameDialogFragment.f74424Oooo0O0 = str;
            audioFileRenameDialogFragment.f74425Oooo0OO = new C29839Oooo0o0(baseToolbarChildFragment, c29196OooO0OO);
            audioFileRenameDialogFragment.show(childFragmentManager, "AudioFileRenameDialogFragment");
        }
    }

    @Override // o0ooOOoo.InterfaceC31656OooO0O0
    public final void OooO0O0(C29196OooO0OO c29196OooO0OO) {
        boolean z = c29196OooO0OO.f103562OooO0oO;
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105795OooO00o;
        String id = c29196OooO0OO.f103556OooO00o;
        if (z) {
            com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooo000 = baseToolbarChildFragment.Oooo000();
            kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
            C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(oooO0oOooo000), null, null, new C29171OoooOOO(oooO0oOooo000, id, null), 3);
        } else {
            com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooo0002 = baseToolbarChildFragment.Oooo000();
            AbstractC24338OooO0o0.OooO00o<Float> oooO00o = com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O;
            oooO0oOooo0002.OooOo00(id, false);
        }
    }

    @Override // o0ooOOoo.InterfaceC31656OooO0O0
    public final void OooO0OO(C29196OooO0OO c29196OooO0OO, Integer num, int i, boolean z) {
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105795OooO00o;
        if (z) {
            com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooo000 = baseToolbarChildFragment.Oooo000();
            String fileId = c29196OooO0OO.f103556OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(fileId, "fileId");
            C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(oooO0oOooo000), null, null, new C29155OooOooO(oooO0oOooo000, i, fileId, null), 3);
            return;
        }
        if (num == null) {
            return;
        }
        List list = (List) baseToolbarChildFragment.Oooo000().f74248OooOooo.f121747OooOo0o.getValue();
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

    @Override // o0ooOOoo.InterfaceC31656OooO0O0
    public final void OooO0Oo() {
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105795OooO00o;
        Iterable iterable = (Iterable) baseToolbarChildFragment.Oooo000().f74248OooOooo.f121747OooOo0o.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((C29196OooO0OO) obj).f103560OooO0o) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C29196OooO0OO) it.next()).f103556OooO00o);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        Context contextRequireContext = baseToolbarChildFragment.requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        String strOooO0Oo = C21111o0ooOoO.OooO0Oo(contextRequireContext.getPackageName(), ".fileProvider");
        LinkedHashMap linkedHashMapOooOOOO = baseToolbarChildFragment.Oooo000().OooOOOO(arrayList2);
        ArrayList arrayList3 = new ArrayList(linkedHashMapOooOOOO.size());
        for (Map.Entry entry : linkedHashMapOooOOOO.entrySet()) {
            arrayList3.add(FileProvider.getUriForFile(contextRequireContext, strOooO0Oo, new File((String) entry.getValue())));
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND_MULTIPLE");
        intent.setType("audio/*");
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", new ArrayList<>(arrayList3));
        intent.addFlags(1);
        baseToolbarChildFragment.startActivity(Intent.createChooser(intent, contextRequireContext.getString(R.string.share_audio_files)));
    }

    @Override // o0ooOOoo.InterfaceC31656OooO0O0
    public final void OooO0o(C29196OooO0OO c29196OooO0OO) {
        boolean z = c29196OooO0OO.f103561OooO0o0;
        BaseToolbarChildFragment baseToolbarChildFragment = this.f105795OooO00o;
        if (z) {
            baseToolbarChildFragment.Oooo000().OooOOoo();
        } else {
            baseToolbarChildFragment.Oooo000().OooOo00(c29196OooO0OO.f103556OooO00o, true);
        }
    }

    @Override // o0ooOOoo.InterfaceC31656OooO0O0
    public final void OooO0o0() {
        this.f105795OooO00o.OoooO0();
    }

    @Override // o0ooOOoo.InterfaceC31656OooO0O0
    public final void OooO0oO(C29197OooO0Oo c29197OooO0Oo) {
        com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooo000 = this.f105795OooO00o.Oooo000();
        C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(oooO0oOooo000), null, null, new C29165Oooo0oo(oooO0oOooo000, c29197OooO0Oo.f103564OooO00o, null), 3);
    }

    @Override // o0ooOOoo.InterfaceC31656OooO0O0
    public final void OooO0oo() {
        final BaseToolbarChildFragment baseToolbarChildFragment = this.f105795OooO00o;
        Iterable iterable = (Iterable) baseToolbarChildFragment.Oooo000().f74248OooOooo.f121747OooOo0o.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((C29196OooO0OO) obj).f103560OooO0o) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C29196OooO0OO) it.next()).f103556OooO00o);
        }
        final Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList2);
        if (setO0OO00O.isEmpty()) {
            return;
        }
        String string = baseToolbarChildFragment.getString(R.string.delete_audio_file);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        String string2 = baseToolbarChildFragment.getString(R.string.alert_delete_audio_file);
        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
        ViewOnClickListenerC26311Ooooooo viewOnClickListenerC26311Ooooooo = new ViewOnClickListenerC26311Ooooooo();
        final InterfaceC31661OooO0oO interfaceC31661OooO0oO = this.f105796OooO0O0;
        new TipsDialogFragment(string, string2, viewOnClickListenerC26311Ooooooo, new View.OnClickListener() { // from class: o0o000oo.OooOOo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseToolbarChildFragment baseToolbarChildFragment2 = baseToolbarChildFragment;
                int size = ((List) baseToolbarChildFragment2.Oooo000().f74248OooOooo.f121747OooOo0o.getValue()).size();
                Set set = setO0OO00O;
                if (size <= set.size()) {
                    interfaceC31661OooO0oO.OooO00o();
                    baseToolbarChildFragment2.Oooo0OO().OooOooo(false);
                }
                com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooo000 = baseToolbarChildFragment2.Oooo000();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(oooO0oOooo000);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C23419OooO0oO(set, oooO0oOooo000, null), 2);
            }
        }).show(baseToolbarChildFragment.getChildFragmentManager(), "TipsDialogFragment");
    }
}
