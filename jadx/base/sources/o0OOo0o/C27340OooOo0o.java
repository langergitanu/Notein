package o0OOo0o;

import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.BackupUseCase$getFolderTreeByVendor$2", m80623f = "BackupUseCase.kt", m80624l = {869, 871}, m80625m = "invokeSuspend")
public final class C27340OooOo0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends BackupFile>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BackupFile.DiskVendor f95182OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95183OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C27351Oooo0O0 f95184OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27340OooOo0o(BackupFile.DiskVendor diskVendor, Continuation continuation, C27351Oooo0O0 c27351Oooo0O0) {
        super(2, continuation);
        this.f95182OooOo = diskVendor;
        this.f95184OooOoO0 = c27351Oooo0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27340OooOo0o(this.f95182OooOo, continuation, this.f95184OooOoO0);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends BackupFile>> continuation) {
        return ((C27340OooOo0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws BackupException {
        C32443OooOOO c32443OooOOO;
        List list;
        List list2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95183OooOo0o;
        boolean z = true;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "BackupUseCase", "getFolderTreeByVendor, vendor = ");
            BackupFile.DiskVendor diskVendor = this.f95182OooOo;
            sbOooO0O0.append(diskVendor);
            sbOooO0O0.append(", searchCurrentInstance = true");
            c20358OooO00o.OooO0o0(sbOooO0O0.toString(), new Object[0]);
            C27351Oooo0O0 c27351Oooo0O0 = this.f95184OooOoO0;
            this.f95183OooOo0o = 1;
            obj = c27351Oooo0O0.f95243OooO0oo.OooOO0o("folder.tree", null, diskVendor, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                c32443OooOOO = (C32443OooOOO) obj;
                int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                list = (List) c32443OooOOO.f116637OooOo;
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("BackupUseCase");
                list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    z = false;
                }
                c20358OooO00o2.OooO0o0("getFolderTreeByVendor, search errCode: " + iIntValue + ", folderTreeFiles.isNullOrEmpty: " + z, new Object[0]);
                if (list == null) {
                    return list;
                }
                throw new BackupException(null, iIntValue, null, 4, null);
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        c32443OooOOO = (C32443OooOOO) obj;
        int iIntValue2 = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
        list = (List) c32443OooOOO.f116637OooOo;
        C34406OooO00o.C20358OooO00o c20358OooO00o22 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o22.OooOOO0("BackupUseCase");
        list2 = list;
        if (list2 != null) {
            z = false;
        }
        c20358OooO00o22.OooO0o0("getFolderTreeByVendor, search errCode: " + iIntValue2 + ", folderTreeFiles.isNullOrEmpty: " + z, new Object[0]);
        if (list == null) {
        }
    }
}
