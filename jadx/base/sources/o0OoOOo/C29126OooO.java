package o0OoOOo;

import Oooo0oO.C21111o0ooOoO;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;
import com.orion.notein.p607ui.noteeditor.audio.C23419OooO0oO;
import com.orion.notein.p607ui.noteeditor.audio.dialog.AudioFileRenameDialogFragment;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0OoOo.C29196OooO0OO;
import o0OoOo.C29197OooO0Oo;
import o0ooOOoo.InterfaceC31656OooO0O0;
import o0ooOOoo.InterfaceC31661OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OoOOo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29126OooO implements InterfaceC31656OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ AudioBarChildFragment f103246OooO00o;

    /* JADX INFO: renamed from: o0OoOOo.OooO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.audio.AudioBarChildFragment$initAudioFilePopupWindow$callback$1$onInsertAudioFileButtonClicked$1", m80623f = "AudioBarChildFragment.kt", m80624l = {175}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AudioBarChildFragment f103247OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f103248OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AudioBarChildFragment audioBarChildFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f103247OooOo = audioBarChildFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f103247OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f103248OooOo0o;
            AudioBarChildFragment audioBarChildFragment = this.f103247OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f103248OooOo0o = 1;
                obj = AudioBarChildFragment.OooOoO(audioBarChildFragment, 34, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                return C32460OooOooO.f116667OooO00o;
            }
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/*");
            audioBarChildFragment.f74179OoooOOo.OooO00o(intent);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C29126OooO(AudioBarChildFragment audioBarChildFragment) {
        this.f103246OooO00o = audioBarChildFragment;
    }

    @Override // o0ooOOoo.InterfaceC31656OooO0O0
    public final void OooO() {
        com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooOoo0 = this.f103246OooO00o.OooOoo0();
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0oOooOoo0), null, null, new o000oOoO(oooO0oOooOoo0, null), 3);
    }

    @Override // o0ooOOoo.InterfaceC31656OooO0O0
    public final void OooO00o(C29196OooO0OO c29196OooO0OO) {
        AudioBarChildFragment audioBarChildFragment = this.f103246OooO00o;
        FragmentManager childFragmentManager = audioBarChildFragment.getChildFragmentManager();
        kotlin.jvm.internal.OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
        if (childFragmentManager.OooOooo("AudioFileRenameDialogFragment") == null) {
            AudioFileRenameDialogFragment audioFileRenameDialogFragment = new AudioFileRenameDialogFragment();
            String str = c29196OooO0OO.f103557OooO0O0;
            if (str == null) {
                str = "";
            }
            audioFileRenameDialogFragment.f74424Oooo0O0 = str;
            audioFileRenameDialogFragment.f74425Oooo0OO = new C29134OooO0oo(audioBarChildFragment, c29196OooO0OO);
            audioFileRenameDialogFragment.show(childFragmentManager, "AudioFileRenameDialogFragment");
        }
    }

    @Override // o0ooOOoo.InterfaceC31656OooO0O0
    public final void OooO0O0(C29196OooO0OO c29196OooO0OO) {
        boolean z = c29196OooO0OO.f103562OooO0oO;
        AudioBarChildFragment audioBarChildFragment = this.f103246OooO00o;
        String id = c29196OooO0OO.f103556OooO00o;
        if (z) {
            com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooOoo0 = audioBarChildFragment.OooOoo0();
            kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
            C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0oOooOoo0), null, null, new C29171OoooOOO(oooO0oOooOoo0, id, null), 3);
        } else {
            com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooOoo02 = audioBarChildFragment.OooOoo0();
            AbstractC24338OooO0o0.OooO00o<Float> oooO00o = com.orion.notein.p607ui.noteeditor.audio.OooO0o.f74218OoooO0O;
            oooO0oOooOoo02.OooOo00(id, false);
        }
    }

    @Override // o0ooOOoo.InterfaceC31656OooO0O0
    public final void OooO0OO(C29196OooO0OO c29196OooO0OO, Integer num, int i, boolean z) {
        AudioBarChildFragment audioBarChildFragment = this.f103246OooO00o;
        if (z) {
            com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooOoo0 = audioBarChildFragment.OooOoo0();
            String fileId = c29196OooO0OO.f103556OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(fileId, "fileId");
            C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0oOooOoo0), null, null, new C29155OooOooO(oooO0oOooOoo0, i, fileId, null), 3);
            return;
        }
        if (num == null) {
            return;
        }
        List list = (List) audioBarChildFragment.OooOoo0().f74248OooOooo.f121747OooOo0o.getValue();
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
        AudioBarChildFragment audioBarChildFragment = this.f103246OooO00o;
        Iterable iterable = (Iterable) audioBarChildFragment.OooOoo0().f74248OooOooo.f121747OooOo0o.getValue();
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
        Context contextRequireContext = audioBarChildFragment.requireContext();
        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        String strOooO0Oo = C21111o0ooOoO.OooO0Oo(contextRequireContext.getPackageName(), ".fileProvider");
        LinkedHashMap linkedHashMapOooOOOO = audioBarChildFragment.OooOoo0().OooOOOO(arrayList2);
        ArrayList arrayList3 = new ArrayList(linkedHashMapOooOOOO.size());
        for (Map.Entry entry : linkedHashMapOooOOOO.entrySet()) {
            arrayList3.add(FileProvider.getUriForFile(contextRequireContext, strOooO0Oo, new File((String) entry.getValue())));
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND_MULTIPLE");
        intent.setType("audio/*");
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", new ArrayList<>(arrayList3));
        intent.addFlags(1);
        audioBarChildFragment.startActivity(Intent.createChooser(intent, contextRequireContext.getString(R.string.share_audio_files)));
    }

    @Override // o0ooOOoo.InterfaceC31656OooO0O0
    public final void OooO0o(C29196OooO0OO c29196OooO0OO) {
        boolean z = c29196OooO0OO.f103561OooO0o0;
        AudioBarChildFragment audioBarChildFragment = this.f103246OooO00o;
        if (z) {
            audioBarChildFragment.OooOoo0().OooOOoo();
        } else {
            audioBarChildFragment.OooOoo0().OooOo00(c29196OooO0OO.f103556OooO00o, true);
        }
    }

    @Override // o0ooOOoo.InterfaceC31656OooO0O0
    public final void OooO0o0() {
        AudioBarChildFragment audioBarChildFragment = this.f103246OooO00o;
        InterfaceC21987OooOoo interfaceC21987OooOoo = audioBarChildFragment.f74160OooOooO;
        if (interfaceC21987OooOoo != null) {
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(interfaceC21987OooOoo), null, null, new OooO00o(audioBarChildFragment, null), 3);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
            throw null;
        }
    }

    @Override // o0ooOOoo.InterfaceC31656OooO0O0
    public final void OooO0oO(C29197OooO0Oo c29197OooO0Oo) {
        com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooOoo0 = this.f103246OooO00o.OooOoo0();
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0oOooOoo0), null, null, new C29165Oooo0oo(oooO0oOooOoo0, c29197OooO0Oo.f103564OooO00o, null), 3);
    }

    @Override // o0ooOOoo.InterfaceC31656OooO0O0
    public final void OooO0oo() {
        final AudioBarChildFragment audioBarChildFragment = this.f103246OooO00o;
        Iterable iterable = (Iterable) audioBarChildFragment.OooOoo0().f74248OooOooo.f121747OooOo0o.getValue();
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
        String string = audioBarChildFragment.getString(R.string.delete_audio_file);
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
        String string2 = audioBarChildFragment.getString(R.string.alert_delete_audio_file);
        kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
        new TipsDialogFragment(string, string2, new ViewOnClickListenerC26311Ooooooo(), new View.OnClickListener() { // from class: o0OoOOo.OooO0Oo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AudioBarChildFragment audioBarChildFragment2 = audioBarChildFragment;
                int size = ((List) audioBarChildFragment2.OooOoo0().f74248OooOooo.f121747OooOo0o.getValue()).size();
                Set set = setO0OO00O;
                if (size <= set.size()) {
                    InterfaceC31661OooO0oO interfaceC31661OooO0oO = audioBarChildFragment2.f74177OoooOO0;
                    if (interfaceC31661OooO0oO != null) {
                        interfaceC31661OooO0oO.OooO00o();
                    }
                    audioBarChildFragment2.OooOoOO().OooOooo(false);
                }
                com.orion.notein.p607ui.noteeditor.audio.OooO0o oooO0oOooOoo0 = audioBarChildFragment2.OooOoo0();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO0oOooOoo0);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C23419OooO0oO(set, oooO0oOooOoo0, null), 2);
            }
        }).show(audioBarChildFragment.getChildFragmentManager(), "TipsDialogFragment");
    }
}
