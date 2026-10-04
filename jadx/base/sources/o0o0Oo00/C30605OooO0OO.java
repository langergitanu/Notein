package o0o0Oo00;

import com.orion.notein.domain.models.cloudsync.CloudSyncError;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteHistoryVersion;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0OOo0o.C27449o00O0OoO;
import o0OoO0oo.oo0o0O0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o0Oo00.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.recover.RecoverHistoryViewModel$recoverNoteHistory$1", m80623f = "RecoverHistoryViewModel.kt", m80624l = {136, 145, 148, 154, 155, 158, 173}, m80625m = "invokeSuspend")
public final class C30605OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f109533OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f109534OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C30603OooO0O0 f109535OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f109536OooOoO0;

    /* JADX INFO: renamed from: o0o0Oo00.OooO0OO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.recover.RecoverHistoryViewModel$recoverNoteHistory$1$1", m80623f = "RecoverHistoryViewModel.kt", m80624l = {161, 162, 164, 165}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C30603OooO0O0 f109537OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f109538OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f109539OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C30603OooO0O0 c30603OooO0O0, String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f109537OooOo = c30603OooO0O0;
            this.f109539OooOoO0 = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f109537OooOo, this.f109539OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        
            if (r8.Ooooo00(r10, r7, r9) == r0) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0054 A[PHI: r10
          0x0054: PHI (r10v6 java.lang.Object) = (r10v5 java.lang.Object), (r10v0 java.lang.Object) binds: [B:23:0x0051, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0058  */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            NoteContent noteContent;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f109538OooOo0o;
            C30603OooO0O0 c30603OooO0O0 = this.f109537OooOo;
            String str = this.f109539OooOoO0;
            C27449o00O0OoO c27449o00O0OoO = c30603OooO0O0.f109495OooO0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f109538OooOo0o = 1;
                obj = c27449o00O0OoO.OooOoOO(str, this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i == 2) {
                    C32446OooOOOo.OooO0O0(obj);
                    this.f109538OooOo0o = 3;
                    obj = c27449o00O0OoO.OooOoO0(str, this);
                    if (obj != enumC32485OooO00o) {
                        noteContent = (NoteContent) obj;
                        if (noteContent != null) {
                        }
                        c30603OooO0O0.f109496OooO0o0.OooO0Oo(str, true);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    return enumC32485OooO00o;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    c30603OooO0O0.f109496OooO0o0.OooO0Oo(str, true);
                    return C32460OooOooO.f116667OooO00o;
                }
                C32446OooOOOo.OooO0O0(obj);
                noteContent = (NoteContent) obj;
                if (noteContent != null) {
                    int size = noteContent.getPages().size();
                    this.f109538OooOo0o = 4;
                }
                c30603OooO0O0.f109496OooO0o0.OooO0Oo(str, true);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            NoteMeta noteMeta = (NoteMeta) obj;
            if (noteMeta != null) {
                this.f109538OooOo0o = 2;
                if (c30603OooO0O0.f109497OooO0oO.OooO0OO(noteMeta, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            this.f109538OooOo0o = 3;
            obj = c27449o00O0OoO.OooOoO0(str, this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30605OooO0OO(C30603OooO0O0 c30603OooO0O0, Continuation<? super C30605OooO0OO> continuation) {
        super(2, continuation);
        this.f109535OooOoO = c30603OooO0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30605OooO0OO(this.f109535OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30605OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0110, code lost:
    
        if (r7.emit(null, r11) != r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0123, code lost:
    
        if (r7.emit(r12, r11) == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0143, code lost:
    
        if (r7.emit(r12, r11) == r1) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3 A[PHI: r0 r2
      0x00e3: PHI (r0v7 java.lang.Object) = (r0v4 java.lang.Object), (r0v13 java.lang.Object) binds: [B:40:0x00e0, B:10:0x002c] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r2v8 java.lang.String) = (r2v6 java.lang.String), (r2v10 java.lang.String) binds: [B:40:0x00e0, B:10:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009c A[SYNTHETIC] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Iterator<T> it;
        Object next;
        NoteHistoryVersion noteHistoryVersion;
        Object objOooO0O0;
        String str3;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109536OooOoO0;
        C30603OooO0O0 c30603OooO0O0 = this.f109535OooOoO;
        C33781o00o0O c33781o00o0O = c30603OooO0O0.f109503OooOOO0;
        C33772OooooOo c33772OooooOo = c30603OooO0O0.f109512OooOo0O;
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                Boolean bool = Boolean.TRUE;
                this.f109536OooOoO0 = 1;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, bool);
                if (C32460OooOooO.f116667OooO00o != enumC32485OooO00o) {
                    str = (String) c30603OooO0O0.f109499OooOO0.getValue();
                    if (str == null && (str2 = (String) c30603OooO0O0.f109501OooOO0o.getValue()) != null) {
                        List<NoteHistoryVersion> list = c30603OooO0O0.f109493OooO.get();
                        OooOOO0.OooO0o(list, "get(...)");
                        it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = null;
                            } else {
                                next = it.next();
                                if (OooOOO0.OooO0O0(((NoteHistoryVersion) next).getId(), str2)) {
                                }
                            }
                        }
                        noteHistoryVersion = (NoteHistoryVersion) next;
                        if (noteHistoryVersion != null) {
                            return C32460OooOooO.f116667OooO00o;
                        }
                        oo0o0O0 oo0o0o0 = new oo0o0O0(c30603OooO0O0, 1);
                        this.f109534OooOo0o = str;
                        this.f109536OooOoO0 = 2;
                        objOooO0O0 = c30603OooO0O0.f109494OooO0Oo.OooO0O0(str, noteHistoryVersion, oo0o0o0, this);
                        if (objOooO0O0 != enumC32485OooO00o) {
                            str3 = str;
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("RecoverHistoryViewModel");
                            c20358OooO00o.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Recover note history result: ", C32445OooOOOO.OooO0O0(objOooO0O0)), new Object[0]);
                            Boolean bool2 = Boolean.FALSE;
                            this.f109534OooOo0o = str3;
                            this.f109533OooOo = objOooO0O0;
                            this.f109536OooOoO0 = 3;
                            c33781o00o0O.getClass();
                            c33781o00o0O.OooOO0(null, bool2);
                            if (C32460OooOooO.f116667OooO00o != enumC32485OooO00o) {
                                if (!(objOooO0O0 instanceof C32445OooOOOO.OooO00o)) {
                                    Throwable thOooO00o = C32445OooOOOO.OooO00o(objOooO0O0);
                                    if (!((thOooO00o instanceof CloudSyncError ? (CloudSyncError) thOooO00o : null) instanceof CloudSyncError.DisallowToUseCellular)) {
                                        Boolean bool3 = Boolean.FALSE;
                                        this.f109534OooOo0o = null;
                                        this.f109533OooOo = null;
                                        this.f109536OooOoO0 = 6;
                                    } else {
                                        C33772OooooOo c33772OooooOo2 = c30603OooO0O0.f109509OooOo;
                                        Boolean bool4 = Boolean.TRUE;
                                        this.f109534OooOo0o = null;
                                        this.f109533OooOo = null;
                                        this.f109536OooOoO0 = 4;
                                        if (c33772OooooOo2.emit(bool4, this) != enumC32485OooO00o) {
                                            this.f109536OooOoO0 = 5;
                                        }
                                    }
                                } else {
                                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                                    C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new OooO00o(c30603OooO0O0, str3, null), 3);
                                    Boolean bool5 = Boolean.TRUE;
                                    this.f109534OooOo0o = null;
                                    this.f109533OooOo = null;
                                    this.f109536OooOoO0 = 7;
                                }
                            }
                        }
                        break;
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                return enumC32485OooO00o;
            case 1:
                C32446OooOOOo.OooO0O0(obj);
                str = (String) c30603OooO0O0.f109499OooOO0.getValue();
                if (str == null) {
                    return C32460OooOooO.f116667OooO00o;
                }
                List<NoteHistoryVersion> list2 = c30603OooO0O0.f109493OooO.get();
                OooOOO0.OooO0o(list2, "get(...)");
                it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                noteHistoryVersion = (NoteHistoryVersion) next;
                if (noteHistoryVersion != null) {
                }
                break;
            case 2:
                String str4 = this.f109534OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                str3 = str4;
                objOooO0O0 = ((C32445OooOOOO) obj).f116639OooOo0o;
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("RecoverHistoryViewModel");
                c20358OooO00o2.OooO0o0(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Recover note history result: ", C32445OooOOOO.OooO0O0(objOooO0O0)), new Object[0]);
                Boolean bool22 = Boolean.FALSE;
                this.f109534OooOo0o = str3;
                this.f109533OooOo = objOooO0O0;
                this.f109536OooOoO0 = 3;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, bool22);
                if (C32460OooOooO.f116667OooO00o != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 3:
                objOooO0O0 = this.f109533OooOo;
                str3 = this.f109534OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                if (!(objOooO0O0 instanceof C32445OooOOOO.OooO00o)) {
                }
                return enumC32485OooO00o;
            case 4:
                C32446OooOOOo.OooO0O0(obj);
                this.f109536OooOoO0 = 5;
                break;
            case 5:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 6:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 7:
                C32446OooOOOo.OooO0O0(obj);
                Integer num = new Integer(100);
                C33781o00o0O c33781o00o0O2 = c30603OooO0O0.f109511OooOo00;
                c33781o00o0O2.getClass();
                c33781o00o0O2.OooOO0(null, num);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
