package o000O0oo;

import androidx.ink.authoring.internal.C21954OooOO0o;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.PageLayerEditor;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import o000O.C24359OooO0Oo;
import o0Ooo0O0.C29389OooOOO;
import o0oOOOoo.C30837OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o000O0oo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC24438OooOoo0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f82468OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f82469OooOo0o;

    public /* synthetic */ RunnableC24438OooOoo0(Object obj, int i) {
        this.f82469OooOo0o = i;
        this.f82468OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f82468OooOo;
        switch (this.f82469OooOo0o) {
            case 0:
                androidx.ink.authoring.internal.OooOO0 oooOO02 = (androidx.ink.authoring.internal.OooOO0) obj;
                C24359OooO0Oo c24359OooO0Oo = oooOO02.f65272OooOO0;
                C24442Oooo00o.OooO00o();
                while (true) {
                    C21954OooOO0o c21954OooOO0o = oooOO02.f65275OooOOO;
                    if (c21954OooOO0o.f65334OooO0o.isEmpty()) {
                        return;
                    }
                    o000O.OooO00o oooO00oPoll = c21954OooOO0o.f65334OooO0o.poll();
                    if (oooO00oPoll != null) {
                        try {
                            oooOO02.f65269OooO0o0.OooO00o(oooO00oPoll);
                        } finally {
                            c24359OooO0Oo.getClass();
                            oooO00oPoll.OooO00o();
                            c24359OooO0Oo.f82161OooO00o.addLast(oooO00oPoll);
                        }
                    }
                }
                break;
            case 1:
                NoteEditorContainerFragment noteEditorContainerFragment = (NoteEditorContainerFragment) obj;
                NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
                noteEditorContainerFragment.Oooo0OO(2, null);
                return;
            default:
                PageLayerEditor pageLayerEditor = (PageLayerEditor) obj;
                ConcurrentHashMap<String, C30837OooO00o> concurrentHashMap = pageLayerEditor.f74877Oooo00O;
                if (concurrentHashMap.isEmpty()) {
                    return;
                }
                Collection<C30837OooO00o> collectionValues = concurrentHashMap.values();
                kotlin.jvm.internal.OooOOO0.OooO0o(collectionValues, "<get-values>(...)");
                List listO0ooOO0 = oOo000Oo.OooOo.o0ooOO0(collectionValues);
                concurrentHashMap.clear();
                androidx.lifecycle.OooOo oooOo = pageLayerEditor.f74866OooOo;
                if (oooOo == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewScope");
                    throw null;
                }
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(oooOo, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29389OooOOO(listO0ooOO0, pageLayerEditor, null), 2);
                return;
        }
    }
}
