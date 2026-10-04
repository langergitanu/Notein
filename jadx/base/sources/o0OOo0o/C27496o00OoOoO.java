package o0OOo0o;

import com.google.firebase.firestore.local.SQLitePersistence;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0OO.C26417OooOoO;
import o0OOoOo.C27787OooO0Oo;
import o0OOoOo.C27788OooO0o;
import o0OOoooO.C28009OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OOo0o.o00OoOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$setNoteInTrashBin$2", m80623f = "NoteUseCase.kt", m80624l = {885, 889, SQLitePersistence.MAX_ARGS, 920, 922, 931, 933}, m80625m = "invokeSuspend")
public final class C27496o00OoOoO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public NoteMeta f96356OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f96357OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ NoteMeta f96358OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f96359OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ boolean f96360OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27449o00O0OoO f96361OooOoo0;

    /* JADX INFO: renamed from: o0OOo0o.o00OoOoO$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$setNoteInTrashBin$2$1", m80623f = "NoteUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C27449o00O0OoO f96362OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
            super(2, continuation);
            this.f96362OooOo0o = c27449o00O0OoO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(continuation, this.f96362OooOo0o);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = this.f96362OooOo0o.f96060OooOoOO;
            String string = abstractApplicationC26277OooOoOO.getString(R.string.delete_fail);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0oO(abstractApplicationC26277OooOoOO, string);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: o0OOo0o.o00OoOoO$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.NoteUseCase$setNoteInTrashBin$2$2", m80623f = "NoteUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C27449o00O0OoO f96363OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Continuation continuation, C27449o00O0OoO c27449o00O0OoO) {
            super(2, continuation);
            this.f96363OooOo0o = c27449o00O0OoO;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO0O0(continuation, this.f96363OooOo0o);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = this.f96363OooOo0o.f96060OooOoOO;
            String string = abstractApplicationC26277OooOoOO.getString(R.string.note_cannot_be_discarded_because_editing);
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0oO(abstractApplicationC26277OooOoOO, string);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27496o00OoOoO(NoteMeta noteMeta, boolean z, C27449o00O0OoO c27449o00O0OoO, Continuation<? super C27496o00OoOoO> continuation) {
        super(2, continuation);
        this.f96358OooOoO = noteMeta;
        this.f96360OooOoOO = z;
        this.f96361OooOoo0 = c27449o00O0OoO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27496o00OoOoO(this.f96358OooOoO, this.f96360OooOoOO, this.f96361OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27496o00OoOoO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (oO0o0OO.C33609OooO0oo.OooO0o(r2, r4, r33) == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (oO0o0OO.C33609OooO0oo.OooO0o(r2, r4, r33) == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b5, code lost:
    
        if (r7 == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0162, code lost:
    
        if (r4.OooO(r2, r33) != r1) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0157 A[PHI: r2
      0x0157: PHI (r2v27 java.lang.String) = (r2v25 java.lang.String), (r2v30 java.lang.String) binds: [B:68:0x0154, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String recoverParentId;
        Object objOooO0Oo;
        String str;
        NoteMeta noteMetaCopy$default;
        Object objOooO00o;
        NoteMeta noteMeta;
        String parentId;
        Object objOooO0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96359OooOoO0;
        boolean z = this.f96360OooOoOO;
        C27449o00O0OoO c27449o00O0OoO = this.f96361OooOoo0;
        NoteMeta noteMeta2 = this.f96358OooOoO;
        switch (i) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                if ((noteMeta2.getInTrashBin() || z) && (!noteMeta2.getInTrashBin() || !z)) {
                    if (c27449o00O0OoO.f96050OooOOo.OooO0O0(noteMeta2.getId())) {
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
                        OooO0O0 oooO0O0 = new OooO0O0(null, c27449o00O0OoO);
                        this.f96359OooOoO0 = 2;
                    } else {
                        if (!z && (recoverParentId = noteMeta2.getRecoverParentId()) != null && recoverParentId.length() != 0) {
                            C28009OooOOOO c28009OooOOOO = c27449o00O0OoO.f96038OooO0Oo;
                            this.f96357OooOo0o = recoverParentId;
                            this.f96359OooOoO0 = 3;
                            objOooO0Oo = c28009OooOOOO.OooO0Oo(recoverParentId);
                        }
                        noteMetaCopy$default = NoteMeta.copy$default(this.f96358OooOoO, null, null, null, str, !z ? noteMeta2.getParentId() : null, false, null, 0, 0, this.f96360OooOoOO, null, 0, 0L, 0L, null, false, false, false, 0L, 523751, null);
                        if (!z) {
                            noteMetaCopy$default.setSortKey(null);
                            this.f96357OooOo0o = null;
                            this.f96356OooOo = null;
                            this.f96359OooOoO0 = 5;
                            if (c27449o00O0OoO.f96036OooO0O0.OooOo0O(new NoteMeta[]{noteMetaCopy$default}, this) != enumC32485OooO00o) {
                                parentId = !z ? noteMeta2.getParentId() : noteMeta2.getRecoverParentId();
                                C27788OooO0o c27788OooO0o = c27449o00O0OoO.f96059OooOoO0;
                                String id = noteMeta2.getId();
                                this.f96357OooOo0o = parentId;
                                this.f96359OooOoO0 = 6;
                                c27788OooO0o.getClass();
                                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27787OooO0Oo(c27788OooO0o, id, null), this);
                                if (objOooO0o != enumC32485OooO00o) {
                                    objOooO0o = C32460OooOooO.f116667OooO00o;
                                }
                                if (objOooO0o != enumC32485OooO00o) {
                                    C27585o00ooO0 c27585o00ooO0 = c27449o00O0OoO.f96057OooOo0o;
                                    this.f96357OooOo0o = null;
                                    this.f96359OooOoO0 = 7;
                                }
                            }
                            break;
                        } else {
                            C26417OooOoO c26417OooOoO = c27449o00O0OoO.f96040OooO0o0;
                            this.f96357OooOo0o = noteMetaCopy$default;
                            this.f96356OooOo = noteMetaCopy$default;
                            this.f96359OooOoO0 = 4;
                            objOooO00o = c26417OooOoO.OooO00o(str, this);
                            if (objOooO00o != enumC32485OooO00o) {
                                noteMeta = noteMetaCopy$default;
                                noteMetaCopy$default.setSortKey((Integer) objOooO00o);
                                noteMetaCopy$default = noteMeta;
                                this.f96357OooOo0o = null;
                                this.f96356OooOo = null;
                                this.f96359OooOoO0 = 5;
                                if (c27449o00O0OoO.f96036OooO0O0.OooOo0O(new NoteMeta[]{noteMetaCopy$default}, this) != enumC32485OooO00o) {
                                }
                            }
                        }
                    }
                    break;
                } else {
                    C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                    AbstractC33687OooO0oO abstractC33687OooO0oO2 = C33833OooOOOO.f121946OooO00o;
                    OooO00o oooO00o = new OooO00o(null, c27449o00O0OoO);
                    this.f96359OooOoO0 = 1;
                    break;
                }
                return enumC32485OooO00o;
            case 1:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 2:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            case 3:
                recoverParentId = (String) this.f96357OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0Oo = obj;
                Folder folder = (Folder) objOooO0Oo;
                str = (folder == null || folder.getInTrashBin()) ? null : recoverParentId;
                noteMetaCopy$default = NoteMeta.copy$default(this.f96358OooOoO, null, null, null, str, !z ? noteMeta2.getParentId() : null, false, null, 0, 0, this.f96360OooOoOO, null, 0, 0L, 0L, null, false, false, false, 0L, 523751, null);
                if (!z) {
                }
                break;
            case 4:
                noteMetaCopy$default = this.f96356OooOo;
                NoteMeta noteMeta3 = (NoteMeta) this.f96357OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                noteMeta = noteMeta3;
                objOooO00o = obj;
                noteMetaCopy$default.setSortKey((Integer) objOooO00o);
                noteMetaCopy$default = noteMeta;
                this.f96357OooOo0o = null;
                this.f96356OooOo = null;
                this.f96359OooOoO0 = 5;
                if (c27449o00O0OoO.f96036OooO0O0.OooOo0O(new NoteMeta[]{noteMetaCopy$default}, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 5:
                C32446OooOOOo.OooO0O0(obj);
                if (!z) {
                }
                C27788OooO0o c27788OooO0o2 = c27449o00O0OoO.f96059OooOoO0;
                String id2 = noteMeta2.getId();
                this.f96357OooOo0o = parentId;
                this.f96359OooOoO0 = 6;
                c27788OooO0o2.getClass();
                C33874OooO0OO c33874OooO0OO22 = C33649OoooOOo.f121328OooO00o;
                objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27787OooO0Oo(c27788OooO0o2, id2, null), this);
                if (objOooO0o != enumC32485OooO00o) {
                }
                if (objOooO0o != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 6:
                parentId = (String) this.f96357OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                C27585o00ooO0 c27585o00ooO02 = c27449o00O0OoO.f96057OooOo0o;
                this.f96357OooOo0o = null;
                this.f96359OooOoO0 = 7;
                break;
            case 7:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
