package o0OOo0o;

import android.net.Uri;
import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o000oo0.C24684Oooo;
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

/* JADX INFO: renamed from: o0OOo0o.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.BackupUseCase$getBackupFilesByUri$2", m80623f = "BackupUseCase.kt", m80624l = {1369}, m80625m = "invokeSuspend")
public final class C27339OooOo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends BackupFile>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C27351Oooo0O0 f95179OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f95180OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Uri f95181OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27339OooOo0O(C27351Oooo0O0 c27351Oooo0O0, Uri uri, Continuation<? super C27339OooOo0O> continuation) {
        super(2, continuation);
        this.f95179OooOo = c27351Oooo0O0;
        this.f95181OooOoO0 = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27339OooOo0O(this.f95179OooOo, this.f95181OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends BackupFile>> continuation) {
        return ((C27339OooOo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws BackupException {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f95180OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC27293OooO0oo interfaceC27293OooO0oo = this.f95179OooOo.f95243OooO0oo;
            this.f95180OooOo0o = 1;
            obj = interfaceC27293OooO0oo.OooO0o("", this.f95181OooOoO0, this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
        int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
        List list = (List) c32443OooOOO.f116637OooOo;
        if (list == null) {
            throw new BackupException(null, iIntValue, null, 4, null);
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                BackupFile backupFile = (BackupFile) obj2;
                String strOoooOoo = C33599OooOo0O.OoooOoo(FilenameUtils.EXTENSION_SEPARATOR, backupFile.getName(), "");
                if (!backupFile.isDir() && (strOoooOoo.equals(BackupFile.EXTENSION_NOTEIN_FILE) || strOoooOoo.equals("template") || strOoooOoo.equals(BackupFile.EXTENSION_FOLDER_TREE_FILE))) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooO0OO(C24684Oooo.OooO0O0(c20358OooO00o, "BackupUseCase", "Couldn't obtain notein files from backup file. ", e), new Object[0]);
            throw new BackupException(null, -3, null, 4, null);
        }
    }
}
