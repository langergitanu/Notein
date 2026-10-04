package o0oOoo00;

import android.util.Log;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.backup.BackupException;
import com.orion.notein.domain.models.backup.BackupFile;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27351Oooo0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000.C32501OooO0oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;

/* JADX INFO: renamed from: o0oOoo00.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.BackupViewModel$recoverSelectedFiles$1", m80623f = "BackupViewModel.kt", m80624l = {StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_4, 308}, m80625m = "invokeSuspend")
public final class C31126OooOO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f111077OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Exception f111078OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C31114OooO f111079OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List<BackupFile> f111080OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31126OooOO0o(List<BackupFile> list, C31114OooO c31114OooO, Continuation<? super C31126OooOO0o> continuation) {
        super(2, continuation);
        this.f111080OooOoO0 = list;
        this.f111079OooOoO = c31114OooO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C31126OooOO0o(this.f111080OooOoO0, this.f111079OooOoO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C31126OooOO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (r11.OooOo0o(r1, null, r10) == r0) goto L34;
     */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Exception exc;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f111077OooOo;
        C31114OooO c31114OooO = this.f111079OooOoO;
        try {
        } catch (Exception e) {
            e = e;
            BackupException backupException = e instanceof BackupException ? (BackupException) e : null;
            if (backupException != null) {
                C33772OooooOo c33772OooooOo = c31114OooO.f111039OooOOoo;
                Integer num = new Integer(backupException.getErrorCode());
                this.f111078OooOo0o = e;
                this.f111077OooOo = 2;
                if (c33772OooooOo.emit(num, this) != enumC32485OooO00o) {
                    exc = e;
                }
                return enumC32485OooO00o;
            }
        }
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            List<BackupFile> list = this.f111080OooOoO0;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                BackupFile backupFile = (BackupFile) obj2;
                if (C32501OooO0oO.OooO0o0(new File(backupFile.getPath())).equals(BackupFile.EXTENSION_NOTEIN_FILE) && ((Set) c31114OooO.f111043OooOo0O.getValue()).contains(backupFile.getId())) {
                    arrayList.add(obj2);
                }
            }
            BackupFile backupFile2 = c31114OooO.f111040OooOo;
            if (backupFile2 != null) {
                arrayList = oOo000Oo.OooOo.OooooOO(arrayList, com.facebook.soloader.OooOo.OooO0oO(backupFile2));
            }
            C27351Oooo0O0 c27351Oooo0O0 = c31114OooO.f111025OooO0Oo;
            this.f111077OooOo = 1;
        } else if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            exc = this.f111078OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            e = exc;
            e.printStackTrace();
            Log.e("BackupViewModel", "Couldn't recover notes from zip. " + C32460OooOooO.f116667OooO00o);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
