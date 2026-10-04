package o0OOo0o;

import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27293OooO0oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.OooOoOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.BackupUseCase$getTemplateFilesByVendor$2", m80623f = "BackupUseCase.kt", m80624l = {836, 842}, m80625m = "invokeSuspend")
public final class C27343OooOoOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends BackupFile>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ BackupFile.DiskVendor f95195OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95196OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C27351Oooo0O0 f95197OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f95198OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27343OooOoOO(BackupFile.DiskVendor diskVendor, boolean z, C27351Oooo0O0 c27351Oooo0O0, Continuation<? super C27343OooOoOO> continuation) {
        super(2, continuation);
        this.f95195OooOo = diskVendor;
        this.f95198OooOoO0 = z;
        this.f95197OooOoO = c27351Oooo0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27343OooOoOO(this.f95195OooOo, this.f95198OooOoO0, this.f95197OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends BackupFile>> continuation) {
        return ((C27343OooOoOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0051, code lost:
    
        if (r13 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r13 == r0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws BackupException {
        C32443OooOOO c32443OooOOO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95196OooOo0o;
        boolean z = true;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o, "BackupUseCase", "getTemplateFilesByVendor, vendor = ");
            BackupFile.DiskVendor diskVendor = this.f95195OooOo;
            sbOooO0O0.append(diskVendor);
            sbOooO0O0.append(", searchCurrentInstance = ");
            boolean z2 = this.f95198OooOoO0;
            sbOooO0O0.append(z2);
            c20358OooO00o.OooO0o0(sbOooO0O0.toString(), new Object[0]);
            C27351Oooo0O0 c27351Oooo0O0 = this.f95197OooOoO;
            if (z2) {
                InterfaceC27293OooO0oo interfaceC27293OooO0oo = c27351Oooo0O0.f95243OooO0oo;
                this.f95196OooOo0o = 1;
                obj = interfaceC27293OooO0oo.OooOO0o(".template", null, diskVendor, this);
            } else {
                InterfaceC27293OooO0oo interfaceC27293OooO0oo2 = c27351Oooo0O0.f95243OooO0oo;
                this.f95196OooOo0o = 2;
                obj = interfaceC27293OooO0oo2.OooO0OO(".template", diskVendor, this);
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
            c32443OooOOO = (C32443OooOOO) obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            c32443OooOOO = (C32443OooOOO) obj;
        }
        int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
        List list = (List) c32443OooOOO.f116637OooOo;
        C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
        c20358OooO00o2.OooOOO0("BackupUseCase");
        List list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        }
        c20358OooO00o2.OooO0o0("getTemplateFilesByVendor, search errCode: " + iIntValue + ", templateFiles.isNullOrEmpty: " + z, new Object[0]);
        if (list == null) {
            throw new BackupException(null, iIntValue, null, 4, null);
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                BackupFile backupFile = (BackupFile) obj2;
                String strOoooOoo = C33599OooOo0O.OoooOoo(FilenameUtils.EXTENSION_SEPARATOR, backupFile.getName(), "");
                if (!backupFile.isDir() && strOoooOoo.equals("template")) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o3.OooOOO0("BackupUseCase");
            c20358OooO00o3.OooO0Oo(e, "getTemplateFilesByVendor error.", new Object[0]);
            throw new BackupException(null, -3, null, 4, null);
        }
    }
}
