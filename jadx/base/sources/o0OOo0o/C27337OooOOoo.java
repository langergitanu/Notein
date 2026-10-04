package o0OOo0o;

import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import java.io.File;
import kotlin.coroutines.Continuation;
import o0Oo0OoO.C28114OooOOOo;
import o0oo000O.C31190OooO0oo;
import o0oo000O.C31193OooOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OOo0o.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.BackupUseCase$createMyTemplateByTemplateFile$2", m80623f = "BackupUseCase.kt", m80624l = {1241, 1257}, m80625m = "invokeSuspend")
public final class C27337OooOOoo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public File f95148OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public File f95149OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ BackupFile f95150OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f95151OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C27351Oooo0O0 f95152OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27337OooOOoo(BackupFile backupFile, C27351Oooo0O0 c27351Oooo0O0, Continuation<? super C27337OooOOoo> continuation) {
        super(2, continuation);
        this.f95150OooOoO = backupFile;
        this.f95152OooOoOO = c27351Oooo0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27337OooOOoo(this.f95150OooOoO, this.f95152OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C27337OooOOoo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        File file;
        File file2;
        int iIntValue;
        File file3;
        File file4;
        int iIntValue2;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95151OooOoO0;
        C27351Oooo0O0 c27351Oooo0O0 = this.f95152OooOoOO;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            BackupFile backupFile = this.f95150OooOoO;
            BackupFile.DiskVendor diskVendor = backupFile.getDiskVendor();
            File file5 = new File(C27351Oooo0O0.OooOO0(c27351Oooo0O0, diskVendor), backupFile.getId() + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + System.currentTimeMillis());
            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(diskVendor.name(), "None")) {
                File file6 = new File(file5, backupFile.getName());
                String absolutePath = file6.getAbsolutePath();
                kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
                this.f95149OooOo0o = file5;
                this.f95148OooOo = file6;
                this.f95151OooOoO0 = 1;
                obj = c27351Oooo0O0.f95243OooO0oo.OooO0oo(backupFile, absolutePath, diskVendor, this);
                if (obj != enumC32485OooO00o) {
                    file = file6;
                    file2 = file5;
                }
                return enumC32485OooO00o;
            }
            file = new File(backupFile.getPath());
            file2 = file5;
            iIntValue = 0;
            if (iIntValue == 0) {
                throw new BackupException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Couldn't download note. ", file.getName()), iIntValue, null, 4, null);
            }
            C31193OooOOo.OooO0OO(file, file2);
            C28114OooOOOo c28114OooOOOo = c27351Oooo0O0.f95238OooO0OO;
            String absolutePath2 = file2.getAbsolutePath();
            kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath2, "getAbsolutePath(...)");
            this.f95149OooOo0o = file2;
            this.f95148OooOo = file;
            this.f95151OooOoO0 = 2;
            obj = c28114OooOOOo.o00000Oo(absolutePath2, this);
            if (obj != enumC32485OooO00o) {
                file3 = file;
                file4 = file2;
                iIntValue2 = ((Number) obj).intValue();
                C31190OooO0oo.OooO0oo(file4);
                if (iIntValue2 != 0) {
                }
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            file3 = this.f95148OooOo;
            file4 = this.f95149OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            iIntValue2 = ((Number) obj).intValue();
            try {
                C31190OooO0oo.OooO0oo(file4);
            } catch (Exception unused) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("BackupUseCase");
                c20358OooO00o.OooO0OO(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Couldn't delete dir. ", file4.getAbsolutePath()), new Object[0]);
            }
            if (iIntValue2 != 0) {
                return C32460OooOooO.f116667OooO00o;
            }
            throw new BackupException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Couldn't restore template. ", file3.getName()), iIntValue2, null, 4, null);
        }
        file = this.f95148OooOo;
        file2 = this.f95149OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        iIntValue = ((Number) obj).intValue();
        if (iIntValue == 0) {
        }
    }
}
