package o0o0O000;

import android.util.Log;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.p607ui.notelist.folder.ItemDataOfMovingToFolder;
import com.orion.notein.p607ui.p609vo.FolderVO;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27600o0ooOO0;
import o0OOo0oo.o0ooOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.folder.FolderDialogViewModel$move$2", m80623f = "FolderDialogViewModel.kt", m80624l = {173, 180, 182, 195, 202, 204}, m80625m = "invokeSuspend")
public final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f107661OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f107662OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ ItemDataOfMovingToFolder f107663OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f107664OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ FolderVO f107665OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ OooO f107666OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(ItemDataOfMovingToFolder itemDataOfMovingToFolder, FolderVO folderVO, OooO oooO, Continuation<? super OooOO0> continuation) {
        super(2, continuation);
        this.f107663OooOoO = itemDataOfMovingToFolder;
        this.f107665OooOoOO = folderVO;
        this.f107666OooOoo0 = oooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooOO0(this.f107663OooOoO, this.f107665OooOoOO, this.f107666OooOoo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1 A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:7:0x002d, B:54:0x00c8, B:56:0x00d0, B:57:0x00d4, B:89:0x0162, B:12:0x0039, B:50:0x00b2, B:51:0x00b6, B:13:0x003e, B:38:0x0086, B:40:0x008b, B:42:0x0091, B:44:0x0094, B:47:0x00a1, B:16:0x0046, B:88:0x015d, B:19:0x0053, B:83:0x014c, B:84:0x014e, B:22:0x005c, B:69:0x011d, B:71:0x0122, B:73:0x0125, B:75:0x012b, B:77:0x012e, B:80:0x013a, B:25:0x0065, B:30:0x0070, B:32:0x0074, B:35:0x007b, B:58:0x00e1, B:60:0x0105, B:62:0x0109, B:65:0x0110, B:91:0x0165), top: B:95:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0 A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:7:0x002d, B:54:0x00c8, B:56:0x00d0, B:57:0x00d4, B:89:0x0162, B:12:0x0039, B:50:0x00b2, B:51:0x00b6, B:13:0x003e, B:38:0x0086, B:40:0x008b, B:42:0x0091, B:44:0x0094, B:47:0x00a1, B:16:0x0046, B:88:0x015d, B:19:0x0053, B:83:0x014c, B:84:0x014e, B:22:0x005c, B:69:0x011d, B:71:0x0122, B:73:0x0125, B:75:0x012b, B:77:0x012e, B:80:0x013a, B:25:0x0065, B:30:0x0070, B:32:0x0074, B:35:0x007b, B:58:0x00e1, B:60:0x0105, B:62:0x0109, B:65:0x0110, B:91:0x0165), top: B:95:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013a A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:7:0x002d, B:54:0x00c8, B:56:0x00d0, B:57:0x00d4, B:89:0x0162, B:12:0x0039, B:50:0x00b2, B:51:0x00b6, B:13:0x003e, B:38:0x0086, B:40:0x008b, B:42:0x0091, B:44:0x0094, B:47:0x00a1, B:16:0x0046, B:88:0x015d, B:19:0x0053, B:83:0x014c, B:84:0x014e, B:22:0x005c, B:69:0x011d, B:71:0x0122, B:73:0x0125, B:75:0x012b, B:77:0x012e, B:80:0x013a, B:25:0x0065, B:30:0x0070, B:32:0x0074, B:35:0x007b, B:58:0x00e1, B:60:0x0105, B:62:0x0109, B:65:0x0110, B:91:0x0165), top: B:95:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015c  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        NoteMeta noteMeta;
        Folder folder;
        String str2;
        Folder folder2;
        Folder folder3;
        Folder folder4;
        ItemDataOfMovingToFolder itemDataOfMovingToFolder = this.f107663OooOoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f107664OooOoO0;
        OooO oooO = this.f107666OooOoo0;
        FolderVO folderVO = this.f107665OooOoOO;
        C27449o00O0OoO c27449o00O0OoO = oooO.f107613OooO0o0;
        o0ooOOo o0ooooo2 = oooO.f107612OooO0o;
        C27600o0ooOO0 c27600o0ooOO0 = oooO.f107611OooO0Oo;
        try {
            switch (i) {
                case 0:
                    C32446OooOOOo.OooO0O0(obj);
                    int i2 = itemDataOfMovingToFolder.f77653OooOoO0;
                    if (i2 == 0) {
                        String str3 = itemDataOfMovingToFolder.f77652OooOo0o;
                        if (str3 != null && str3.length() != 0) {
                            this.f107662OooOo0o = str3;
                            this.f107664OooOoO0 = 1;
                            Object objOooOoOO = c27449o00O0OoO.OooOoOO(str3, this);
                            if (objOooOoOO != enumC32485OooO00o) {
                                str = str3;
                                obj = objOooOoOO;
                                noteMeta = (NoteMeta) obj;
                                if (noteMeta == null && !noteMeta.getInTrashBin()) {
                                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(folderVO.getId(), "desktop")) {
                                        String id = folderVO.getId();
                                        this.f107662OooOo0o = str;
                                        this.f107661OooOo = noteMeta;
                                        this.f107664OooOoO0 = 2;
                                        obj = c27600o0ooOO0.OooO0Oo(id, this);
                                        if (obj == enumC32485OooO00o) {
                                        }
                                        folder = (Folder) obj;
                                        this.f107662OooOo0o = str;
                                        this.f107661OooOo = null;
                                        this.f107664OooOoO0 = 3;
                                        if (c27449o00O0OoO.Oooo0o(noteMeta, folder, this) != enumC32485OooO00o) {
                                        }
                                    } else {
                                        folder = null;
                                        this.f107662OooOo0o = str;
                                        this.f107661OooOo = null;
                                        this.f107664OooOoO0 = 3;
                                        if (c27449o00O0OoO.Oooo0o(noteMeta, folder, this) != enumC32485OooO00o) {
                                            str2 = str;
                                            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                                            o0ooooo2.OooO0Oo(str2, true);
                                            return Boolean.TRUE;
                                        }
                                    }
                                }
                                return Boolean.FALSE;
                            }
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("FolderDialogViewModel");
                        c20358OooO00o.OooO0OO("move note: " + itemDataOfMovingToFolder + " to folder: " + folderVO + " failed, noteId is null or empty.", new Object[0]);
                        return Boolean.FALSE;
                    }
                    if (i2 == 1) {
                        String str4 = itemDataOfMovingToFolder.f77651OooOo;
                        if (str4 != null && str4.length() != 0) {
                            this.f107664OooOoO0 = 4;
                            obj = c27600o0ooOO0.OooO0Oo(str4, this);
                            if (obj != enumC32485OooO00o) {
                                folder2 = (Folder) obj;
                                if (folder2 == null && folder2.getInTrashBin()) {
                                    return Boolean.FALSE;
                                }
                                if (kotlin.jvm.internal.OooOOO0.OooO0O0(folderVO.getId(), "desktop")) {
                                    String id2 = folderVO.getId();
                                    this.f107662OooOo0o = folder2;
                                    this.f107664OooOoO0 = 5;
                                    obj = c27600o0ooOO0.OooO0Oo(id2, this);
                                    if (obj == enumC32485OooO00o) {
                                    }
                                    folder3 = folder2;
                                    folder4 = (Folder) obj;
                                    kotlin.jvm.internal.OooOOO0.OooO0Oo(folder3);
                                    this.f107662OooOo0o = folder3;
                                    this.f107661OooOo = folder4;
                                    this.f107664OooOoO0 = 6;
                                    if (c27600o0ooOO0.OooOO0(folder3, folder4, this) == enumC32485OooO00o) {
                                    }
                                    C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                                    o0ooooo2.OooO0OO(oOo000Oo.OooOOO.OooOoO(new String[]{folder3.getId(), folder4 != null ? folder4.getId() : null}));
                                } else {
                                    folder3 = folder2;
                                    folder4 = null;
                                    kotlin.jvm.internal.OooOOO0.OooO0Oo(folder3);
                                    this.f107662OooOo0o = folder3;
                                    this.f107661OooOo = folder4;
                                    this.f107664OooOoO0 = 6;
                                    if (c27600o0ooOO0.OooOO0(folder3, folder4, this) == enumC32485OooO00o) {
                                    }
                                    C32460OooOooO c32460OooOooO22 = C32460OooOooO.f116667OooO00o;
                                    o0ooooo2.OooO0OO(oOo000Oo.OooOOO.OooOoO(new String[]{folder3.getId(), folder4 != null ? folder4.getId() : null}));
                                }
                            }
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o2.OooOOO0("FolderDialogViewModel");
                        c20358OooO00o2.OooO0OO("move folder: " + itemDataOfMovingToFolder + " to folder: " + folderVO + " failed, src folderId is null or empty.", new Object[0]);
                        return Boolean.FALSE;
                    }
                    return Boolean.TRUE;
                    return enumC32485OooO00o;
                case 1:
                    String str5 = (String) this.f107662OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    str = str5;
                    noteMeta = (NoteMeta) obj;
                    if (noteMeta == null) {
                        return Boolean.FALSE;
                    }
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(folderVO.getId(), "desktop")) {
                    }
                    break;
                case 2:
                    noteMeta = (NoteMeta) this.f107661OooOo;
                    str = (String) this.f107662OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    folder = (Folder) obj;
                    this.f107662OooOo0o = str;
                    this.f107661OooOo = null;
                    this.f107664OooOoO0 = 3;
                    if (c27449o00O0OoO.Oooo0o(noteMeta, folder, this) != enumC32485OooO00o) {
                    }
                    return enumC32485OooO00o;
                case 3:
                    str2 = (String) this.f107662OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
                    o0ooooo2.OooO0Oo(str2, true);
                    return Boolean.TRUE;
                case 4:
                    C32446OooOOOo.OooO0O0(obj);
                    folder2 = (Folder) obj;
                    if (folder2 == null) {
                    }
                    if (kotlin.jvm.internal.OooOOO0.OooO0O0(folderVO.getId(), "desktop")) {
                    }
                    break;
                case 5:
                    folder2 = (Folder) this.f107662OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    folder3 = folder2;
                    folder4 = (Folder) obj;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(folder3);
                    this.f107662OooOo0o = folder3;
                    this.f107661OooOo = folder4;
                    this.f107664OooOoO0 = 6;
                    if (c27600o0ooOO0.OooOO0(folder3, folder4, this) == enumC32485OooO00o) {
                    }
                    C32460OooOooO c32460OooOooO222 = C32460OooOooO.f116667OooO00o;
                    o0ooooo2.OooO0OO(oOo000Oo.OooOOO.OooOoO(new String[]{folder3.getId(), folder4 != null ? folder4.getId() : null}));
                    return Boolean.TRUE;
                case 6:
                    folder4 = (Folder) this.f107661OooOo;
                    folder3 = (Folder) this.f107662OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C32460OooOooO c32460OooOooO2222 = C32460OooOooO.f116667OooO00o;
                    o0ooooo2.OooO0OO(oOo000Oo.OooOOO.OooOoO(new String[]{folder3.getId(), folder4 != null ? folder4.getId() : null}));
                    return Boolean.TRUE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.d("FolderDialogViewModel", "Unable to move it. " + C32460OooOooO.f116667OooO00o);
            return Boolean.FALSE;
        }
    }
}
