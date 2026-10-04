package o0OoO0oo;

import android.util.Log;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.p609vo.PenVO;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o00o00Oo.C25261OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOo.C33695OooO0o0;
import oO0o0OOo.InterfaceC33701OooOO0o;
import oO0o0OOo.InterfaceC33709OooOo;

/* JADX INFO: renamed from: o0OoO0oo.o00OO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.NoteEditorFragment$initEditor$11", m80623f = "NoteEditorFragment.kt", m80624l = {6203, 4018, 4031, 4037}, m80625m = "invokeSuspend")
public final class C28856o00OO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public InterfaceC33709OooOo f102207OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public NoteEditorFragment f102208OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f102209OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InterfaceC33701OooOO0o f102210OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C33695OooO0o0 f102211OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ NoteEditorFragment f102212OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28856o00OO0o(C33695OooO0o0 c33695OooO0o0, NoteEditorFragment noteEditorFragment, Continuation continuation) {
        super(2, continuation);
        this.f102211OooOoOO = c33695OooO0o0;
        this.f102212OooOoo0 = noteEditorFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28856o00OO0o(this.f102211OooOoOO, this.f102212OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28856o00OO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0153, code lost:
    
        if (r10.OooOOO(r14, false, r13) == r0) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:9:0x001a, B:82:0x0161, B:27:0x0055, B:31:0x0069, B:33:0x0071, B:35:0x007f, B:38:0x0086, B:39:0x0098, B:41:0x009e, B:45:0x00ad, B:47:0x00b1, B:49:0x00b7, B:52:0x00c9, B:53:0x00db, B:55:0x00e1, B:59:0x00f0, B:61:0x00f7, B:62:0x0109, B:64:0x010f, B:68:0x011e, B:71:0x0124, B:60:0x00f5, B:74:0x0137, B:76:0x013f, B:78:0x0143, B:81:0x0156, B:83:0x0165, B:16:0x0030, B:19:0x003a, B:22:0x0045, B:25:0x004e), top: B:92:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:9:0x001a, B:82:0x0161, B:27:0x0055, B:31:0x0069, B:33:0x0071, B:35:0x007f, B:38:0x0086, B:39:0x0098, B:41:0x009e, B:45:0x00ad, B:47:0x00b1, B:49:0x00b7, B:52:0x00c9, B:53:0x00db, B:55:0x00e1, B:59:0x00f0, B:61:0x00f7, B:62:0x0109, B:64:0x010f, B:68:0x011e, B:71:0x0124, B:60:0x00f5, B:74:0x0137, B:76:0x013f, B:78:0x0143, B:81:0x0156, B:83:0x0165, B:16:0x0030, B:19:0x003a, B:22:0x0045, B:25:0x004e), top: B:92:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010f A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:9:0x001a, B:82:0x0161, B:27:0x0055, B:31:0x0069, B:33:0x0071, B:35:0x007f, B:38:0x0086, B:39:0x0098, B:41:0x009e, B:45:0x00ad, B:47:0x00b1, B:49:0x00b7, B:52:0x00c9, B:53:0x00db, B:55:0x00e1, B:59:0x00f0, B:61:0x00f7, B:62:0x0109, B:64:0x010f, B:68:0x011e, B:71:0x0124, B:60:0x00f5, B:74:0x0137, B:76:0x013f, B:78:0x0143, B:81:0x0156, B:83:0x0165, B:16:0x0030, B:19:0x003a, B:22:0x0045, B:25:0x004e), top: B:92:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:9:0x001a, B:82:0x0161, B:27:0x0055, B:31:0x0069, B:33:0x0071, B:35:0x007f, B:38:0x0086, B:39:0x0098, B:41:0x009e, B:45:0x00ad, B:47:0x00b1, B:49:0x00b7, B:52:0x00c9, B:53:0x00db, B:55:0x00e1, B:59:0x00f0, B:61:0x00f7, B:62:0x0109, B:64:0x010f, B:68:0x011e, B:71:0x0124, B:60:0x00f5, B:74:0x0137, B:76:0x013f, B:78:0x0143, B:81:0x0156, B:83:0x0165, B:16:0x0030, B:19:0x003a, B:22:0x0045, B:25:0x004e), top: B:92:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0165 A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #1 {all -> 0x001f, blocks: (B:9:0x001a, B:82:0x0161, B:27:0x0055, B:31:0x0069, B:33:0x0071, B:35:0x007f, B:38:0x0086, B:39:0x0098, B:41:0x009e, B:45:0x00ad, B:47:0x00b1, B:49:0x00b7, B:52:0x00c9, B:53:0x00db, B:55:0x00e1, B:59:0x00f0, B:61:0x00f7, B:62:0x0109, B:64:0x010f, B:68:0x011e, B:71:0x0124, B:60:0x00f5, B:74:0x0137, B:76:0x013f, B:78:0x0143, B:81:0x0156, B:83:0x0165, B:16:0x0030, B:19:0x003a, B:22:0x0045, B:25:0x004e), top: B:92:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0081 -> B:37:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0122 -> B:37:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0134 -> B:37:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x013d -> B:37:0x0083). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0153 -> B:82:0x0161). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0156 -> B:82:0x0161). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC33701OooOO0o oooO00o;
        NoteEditorFragment noteEditorFragment;
        NoteEditorFragment noteEditorFragment2;
        InterfaceC33709OooOo interfaceC33709OooOo;
        InterfaceC33701OooOO0o interfaceC33701OooOO0o;
        Iterator it;
        Object next;
        PenVO penVO;
        InterfaceC33709OooOo interfaceC33709OooOo2;
        Iterator it2;
        Object next2;
        InterfaceC33709OooOo interfaceC33709OooOo3;
        Object next3;
        InterfaceC33709OooOo interfaceC33709OooOo4;
        Object objOooO00o;
        InterfaceC33709OooOo interfaceC33709OooOo5;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f102209OooOoO;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C33695OooO0o0 c33695OooO0o0 = this.f102211OooOoOO;
                oooO00o = new C33695OooO0o0.OooO00o();
                noteEditorFragment = this.f102212OooOoo0;
                interfaceC33709OooOo4 = c33695OooO0o0;
                this.f102208OooOo0o = noteEditorFragment;
                this.f102207OooOo = interfaceC33709OooOo4;
                this.f102210OooOoO0 = oooO00o;
                this.f102209OooOoO = 1;
                objOooO00o = oooO00o.OooO00o(this);
                if (objOooO00o == enumC32485OooO00o) {
                }
            } else if (i == 1) {
                interfaceC33701OooOO0o = this.f102210OooOoO0;
                InterfaceC33709OooOo interfaceC33709OooOo6 = this.f102207OooOo;
                noteEditorFragment2 = this.f102208OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33709OooOo3 = interfaceC33709OooOo6;
                if (((Boolean) obj).booleanValue()) {
                }
            } else if (i == 2) {
                interfaceC33701OooOO0o = this.f102210OooOoO0;
                InterfaceC33709OooOo interfaceC33709OooOo7 = this.f102207OooOo;
                noteEditorFragment2 = this.f102208OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33709OooOo2 = interfaceC33709OooOo7;
                it2 = ((Iterable) noteEditorFragment2.OoooOOO().f75171Oooo00O.f121747OooOo0o.getValue()).iterator();
                while (true) {
                    if (it2.hasNext()) {
                    }
                }
                noteEditorFragment2.f73002OooOooo = (PenVO) next2;
                interfaceC33709OooOo = interfaceC33709OooOo2;
                it = ((Iterable) noteEditorFragment2.OoooOOO().f75171Oooo00O.f121747OooOo0o.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                    }
                }
                penVO = (PenVO) next;
                if (penVO == null) {
                }
                oooO00o = interfaceC33701OooOO0o;
                noteEditorFragment = noteEditorFragment2;
                interfaceC33709OooOo4 = interfaceC33709OooOo5;
                this.f102208OooOo0o = noteEditorFragment;
                this.f102207OooOo = interfaceC33709OooOo4;
                this.f102210OooOoO0 = oooO00o;
                this.f102209OooOoO = 1;
                objOooO00o = oooO00o.OooO00o(this);
                if (objOooO00o == enumC32485OooO00o) {
                }
            } else if (i == 3) {
                interfaceC33701OooOO0o = this.f102210OooOoO0;
                InterfaceC33709OooOo interfaceC33709OooOo8 = this.f102207OooOo;
                noteEditorFragment2 = this.f102208OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33709OooOo5 = interfaceC33709OooOo8;
                oooO00o = interfaceC33701OooOO0o;
                noteEditorFragment = noteEditorFragment2;
                interfaceC33709OooOo4 = interfaceC33709OooOo5;
                this.f102208OooOo0o = noteEditorFragment;
                this.f102207OooOo = interfaceC33709OooOo4;
                this.f102210OooOoO0 = oooO00o;
                this.f102209OooOoO = 1;
                objOooO00o = oooO00o.OooO00o(this);
                if (objOooO00o == enumC32485OooO00o) {
                }
            } else {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC33701OooOO0o = this.f102210OooOoO0;
                InterfaceC33709OooOo interfaceC33709OooOo9 = this.f102207OooOo;
                noteEditorFragment2 = this.f102208OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33709OooOo interfaceC33709OooOo10 = interfaceC33709OooOo9;
                noteEditorFragment2.f73002OooOooo = null;
                interfaceC33709OooOo5 = interfaceC33709OooOo10;
                oooO00o = interfaceC33701OooOO0o;
                noteEditorFragment = noteEditorFragment2;
                interfaceC33709OooOo4 = interfaceC33709OooOo5;
                this.f102208OooOo0o = noteEditorFragment;
                this.f102207OooOo = interfaceC33709OooOo4;
                this.f102210OooOoO0 = oooO00o;
                this.f102209OooOoO = 1;
                objOooO00o = oooO00o.OooO00o(this);
                if (objOooO00o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
                NoteEditorFragment noteEditorFragment3 = noteEditorFragment;
                interfaceC33701OooOO0o = oooO00o;
                obj = objOooO00o;
                noteEditorFragment2 = noteEditorFragment3;
                interfaceC33709OooOo3 = interfaceC33709OooOo4;
                if (((Boolean) obj).booleanValue()) {
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    interfaceC33709OooOo3.cancel(null);
                    return C32460OooOooO.f116667OooO00o;
                }
                String str = (String) interfaceC33701OooOO0o.next();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, "PRESSED")) {
                    interfaceC33709OooOo5 = interfaceC33709OooOo3;
                    if (noteEditorFragment2.f73002OooOooo == null) {
                        Iterator it3 = ((Iterable) noteEditorFragment2.OoooOOO().f75171Oooo00O.f121747OooOo0o.getValue()).iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it3.next();
                            if (((PenVO) next3).getSelected()) {
                                break;
                            }
                        }
                        PenVO penVO2 = (PenVO) next3;
                        if (penVO2 == null || penVO2.getType() != 3) {
                            noteEditorFragment2.f73002OooOooo = penVO2;
                            interfaceC33709OooOo = interfaceC33709OooOo3;
                            it = ((Iterable) noteEditorFragment2.OoooOOO().f75171Oooo00O.f121747OooOo0o.getValue()).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                                if (((PenVO) next).getType() == 3) {
                                    break;
                                }
                            }
                            penVO = (PenVO) next;
                            if (penVO == null) {
                                interfaceC33709OooOo5 = interfaceC33709OooOo;
                            } else {
                                com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0OoooOOO = noteEditorFragment2.OoooOOO();
                                this.f102208OooOo0o = noteEditorFragment2;
                                this.f102207OooOo = interfaceC33709OooOo;
                                this.f102210OooOoO0 = interfaceC33701OooOO0o;
                                this.f102209OooOoO = 3;
                                interfaceC33709OooOo5 = interfaceC33709OooOo;
                                if (oooO0O0OoooOOO.OooOOO(penVO, false, this) == enumC32485OooO00o) {
                                    return enumC32485OooO00o;
                                }
                            }
                        } else {
                            this.f102208OooOo0o = noteEditorFragment2;
                            this.f102207OooOo = interfaceC33709OooOo3;
                            this.f102210OooOoO0 = interfaceC33701OooOO0o;
                            this.f102209OooOoO = 2;
                            interfaceC33709OooOo2 = interfaceC33709OooOo3;
                            if (C33644OoooO0.OooO00o(100L, this) == enumC32485OooO00o) {
                                return enumC32485OooO00o;
                            }
                            it2 = ((Iterable) noteEditorFragment2.OoooOOO().f75171Oooo00O.f121747OooOo0o.getValue()).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it2.next();
                                if (((PenVO) next2).getSelected()) {
                                    break;
                                }
                            }
                            noteEditorFragment2.f73002OooOooo = (PenVO) next2;
                            interfaceC33709OooOo = interfaceC33709OooOo2;
                            it = ((Iterable) noteEditorFragment2.OoooOOO().f75171Oooo00O.f121747OooOo0o.getValue()).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                }
                            }
                            penVO = (PenVO) next;
                            if (penVO == null) {
                            }
                        }
                    }
                    oooO00o = interfaceC33701OooOO0o;
                    noteEditorFragment = noteEditorFragment2;
                    interfaceC33709OooOo4 = interfaceC33709OooOo5;
                } else {
                    interfaceC33709OooOo5 = interfaceC33709OooOo3;
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, "RELEASED")) {
                        PenVO penVO3 = noteEditorFragment2.f73002OooOooo;
                        if (penVO3 != null) {
                            com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0OoooOOO2 = noteEditorFragment2.OoooOOO();
                            this.f102208OooOo0o = noteEditorFragment2;
                            this.f102207OooOo = interfaceC33709OooOo3;
                            this.f102210OooOoO0 = interfaceC33701OooOO0o;
                            this.f102209OooOoO = 4;
                            interfaceC33709OooOo10 = interfaceC33709OooOo3;
                        } else {
                            C25261OooO0o0.OooO0OO(Log.w("NoteEditorFragment", "没有保存的笔可以恢复"));
                            interfaceC33709OooOo10 = interfaceC33709OooOo3;
                        }
                        noteEditorFragment2.f73002OooOooo = null;
                        interfaceC33709OooOo5 = interfaceC33709OooOo10;
                    }
                    oooO00o = interfaceC33701OooOO0o;
                    noteEditorFragment = noteEditorFragment2;
                    interfaceC33709OooOo4 = interfaceC33709OooOo5;
                }
                this.f102208OooOo0o = noteEditorFragment;
                this.f102207OooOo = interfaceC33709OooOo4;
                this.f102210OooOoO0 = oooO00o;
                this.f102209OooOoO = 1;
                objOooO00o = oooO00o.OooO00o(this);
                if (objOooO00o == enumC32485OooO00o) {
                }
            }
        } finally {
        }
    }
}
