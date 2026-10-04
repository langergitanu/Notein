package o0o00oOo;

import com.aspose.words.EditingLanguage;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.p609vo.NoteVO;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27600o0ooOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o00oOo.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.NoteListViewModel$move$2", m80623f = "NoteListViewModel.kt", m80624l = {EditingLanguage.MACEDONIAN, EditingLanguage.AFRIKAANS, EditingLanguage.FAEROESE, EditingLanguage.KAZAKH, EditingLanguage.UZBEK_LATIN, EditingLanguage.BANGLA_INDIA}, m80625m = "invokeSuspend")
public final class C30074OooooO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Folder f106991OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f106992OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f106993OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f106994OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ NoteVO f106995OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ com.orion.notein.p607ui.notelist.OooO0OO f106996OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ int f106997OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30074OooooO0(String str, NoteVO noteVO, int i, com.orion.notein.p607ui.notelist.OooO0OO oooO0OO, Continuation<? super C30074OooooO0> continuation) {
        super(2, continuation);
        this.f106993OooOoO = str;
        this.f106995OooOoOO = noteVO;
        this.f106997OooOoo0 = i;
        this.f106996OooOoo = oooO0OO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30074OooooO0(this.f106993OooOoO, this.f106995OooOoOO, this.f106997OooOoo0, this.f106996OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C30074OooooO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0113, code lost:
    
        if (r2.Oooo0o(r1, r11, r10) == r0) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:7:0x0022, B:43:0x00b2, B:45:0x00bc, B:46:0x00c0, B:69:0x011d, B:12:0x002e, B:38:0x009c, B:39:0x009e, B:13:0x0032, B:32:0x007a, B:35:0x0089, B:14:0x0036, B:68:0x0116, B:17:0x003f, B:64:0x0106, B:65:0x0108, B:18:0x0044, B:50:0x00d7, B:52:0x00dc, B:54:0x00df, B:56:0x00e5, B:58:0x00e8, B:61:0x00f4, B:21:0x004c, B:23:0x0056, B:25:0x0065, B:29:0x006d, B:47:0x00cc), top: B:73:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bc A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:7:0x0022, B:43:0x00b2, B:45:0x00bc, B:46:0x00c0, B:69:0x011d, B:12:0x002e, B:38:0x009c, B:39:0x009e, B:13:0x0032, B:32:0x007a, B:35:0x0089, B:14:0x0036, B:68:0x0116, B:17:0x003f, B:64:0x0106, B:65:0x0108, B:18:0x0044, B:50:0x00d7, B:52:0x00dc, B:54:0x00df, B:56:0x00e5, B:58:0x00e8, B:61:0x00f4, B:21:0x004c, B:23:0x0056, B:25:0x0065, B:29:0x006d, B:47:0x00cc), top: B:73:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:7:0x0022, B:43:0x00b2, B:45:0x00bc, B:46:0x00c0, B:69:0x011d, B:12:0x002e, B:38:0x009c, B:39:0x009e, B:13:0x0032, B:32:0x007a, B:35:0x0089, B:14:0x0036, B:68:0x0116, B:17:0x003f, B:64:0x0106, B:65:0x0108, B:18:0x0044, B:50:0x00d7, B:52:0x00dc, B:54:0x00df, B:56:0x00e5, B:58:0x00e8, B:61:0x00f4, B:21:0x004c, B:23:0x0056, B:25:0x0065, B:29:0x006d, B:47:0x00cc), top: B:73:0x0011 }] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NoteMeta noteMeta;
        Folder folder;
        Folder folder2;
        Folder folder3;
        C27600o0ooOO0 c27600o0ooOO0;
        Folder folder4;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f106994OooOoO0;
        String str = this.f106993OooOoO;
        NoteVO noteVO = this.f106995OooOoOO;
        com.orion.notein.p607ui.notelist.OooO0OO oooO0OO = this.f106996OooOoo;
        try {
            switch (i) {
                case 0:
                    C32446OooOOOo.OooO0O0(obj);
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, noteVO.getId())) {
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("NoteListViewModel");
                        c20358OooO00o.OooO00o("move: id == dstFolder.id", new Object[0]);
                        return Boolean.FALSE;
                    }
                    int i2 = this.f106997OooOoo0;
                    if (i2 == 0) {
                        C27449o00O0OoO c27449o00O0OoO = oooO0OO.f77121OooO0Oo;
                        this.f106994OooOoO0 = 1;
                        obj = c27449o00O0OoO.OooOoOO(str, this);
                        if (obj != enumC32485OooO00o) {
                            noteMeta = (NoteMeta) obj;
                            if (noteMeta == null && !noteMeta.getInTrashBin()) {
                                if (!kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO.getId(), "desktop")) {
                                    folder = null;
                                    C27449o00O0OoO c27449o00O0OoO2 = oooO0OO.f77121OooO0Oo;
                                    this.f106992OooOo0o = null;
                                    this.f106994OooOoO0 = 3;
                                } else {
                                    C27600o0ooOO0 c27600o0ooOO02 = oooO0OO.f77124OooO0oO;
                                    String id = noteVO.getId();
                                    this.f106992OooOo0o = noteMeta;
                                    this.f106994OooOoO0 = 2;
                                    obj = c27600o0ooOO02.OooO0Oo(id, this);
                                    if (obj == enumC32485OooO00o) {
                                    }
                                    folder = (Folder) obj;
                                    C27449o00O0OoO c27449o00O0OoO22 = oooO0OO.f77121OooO0Oo;
                                    this.f106992OooOo0o = null;
                                    this.f106994OooOoO0 = 3;
                                }
                                break;
                            }
                            return Boolean.FALSE;
                        }
                    } else {
                        if (i2 != 1) {
                            return Boolean.TRUE;
                        }
                        C27600o0ooOO0 c27600o0ooOO03 = oooO0OO.f77124OooO0oO;
                        this.f106994OooOoO0 = 4;
                        obj = c27600o0ooOO03.OooO0Oo(str, this);
                        if (obj != enumC32485OooO00o) {
                            folder2 = (Folder) obj;
                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO.getId(), "desktop")) {
                                C27600o0ooOO0 c27600o0ooOO04 = oooO0OO.f77124OooO0oO;
                                String id2 = noteVO.getId();
                                this.f106992OooOo0o = folder2;
                                this.f106994OooOoO0 = 5;
                                obj = c27600o0ooOO04.OooO0Oo(id2, this);
                                if (obj == enumC32485OooO00o) {
                                }
                                folder3 = (Folder) obj;
                                c27600o0ooOO0 = oooO0OO.f77124OooO0oO;
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(folder2);
                                this.f106992OooOo0o = folder2;
                                this.f106991OooOo = folder3;
                                this.f106994OooOoO0 = 6;
                                if (c27600o0ooOO0.OooOO0(folder2, folder3, this) != enumC32485OooO00o) {
                                }
                            } else {
                                folder3 = null;
                                c27600o0ooOO0 = oooO0OO.f77124OooO0oO;
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(folder2);
                                this.f106992OooOo0o = folder2;
                                this.f106991OooOo = folder3;
                                this.f106994OooOoO0 = 6;
                                if (c27600o0ooOO0.OooOO0(folder2, folder3, this) != enumC32485OooO00o) {
                                    folder4 = folder3;
                                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                    oooO0OO.f77138OooOo00.OooO0OO(oOo000Oo.OooOOO.OooOoO(new String[]{folder2.getId(), folder4 != null ? folder4.getId() : null}));
                                    return Boolean.TRUE;
                                }
                            }
                        }
                    }
                    return enumC32485OooO00o;
                case 1:
                    C32446OooOOOo.OooO0O0(obj);
                    noteMeta = (NoteMeta) obj;
                    if (noteMeta == null) {
                        return Boolean.FALSE;
                    }
                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO.getId(), "desktop")) {
                    }
                    break;
                case 2:
                    noteMeta = (NoteMeta) this.f106992OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    folder = (Folder) obj;
                    C27449o00O0OoO c27449o00O0OoO222 = oooO0OO.f77121OooO0Oo;
                    this.f106992OooOo0o = null;
                    this.f106994OooOoO0 = 3;
                    break;
                case 3:
                    C32446OooOOOo.OooO0O0(obj);
                    C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                    oooO0OO.f77138OooOo00.OooO0Oo(str, true);
                    return Boolean.TRUE;
                case 4:
                    C32446OooOOOo.OooO0O0(obj);
                    folder2 = (Folder) obj;
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(noteVO.getId(), "desktop")) {
                    }
                    break;
                case 5:
                    folder2 = (Folder) this.f106992OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    folder3 = (Folder) obj;
                    c27600o0ooOO0 = oooO0OO.f77124OooO0oO;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(folder2);
                    this.f106992OooOo0o = folder2;
                    this.f106991OooOo = folder3;
                    this.f106994OooOoO0 = 6;
                    if (c27600o0ooOO0.OooOO0(folder2, folder3, this) != enumC32485OooO00o) {
                    }
                    break;
                case 6:
                    folder4 = this.f106991OooOo;
                    folder2 = (Folder) this.f106992OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
                    oooO0OO.f77138OooOo00.OooO0OO(oOo000Oo.OooOOO.OooOoO(new String[]{folder2.getId(), folder4 != null ? folder4.getId() : null}));
                    return Boolean.TRUE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("NoteListViewModel");
            c20358OooO00o2.OooO0Oo(e, "Unable to move note", new Object[0]);
            return Boolean.FALSE;
        }
    }
}
