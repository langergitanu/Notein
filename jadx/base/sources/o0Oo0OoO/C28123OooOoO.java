package o0Oo0OoO;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Oo0OoO.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.task.PdfInfoBackupTask", m80623f = "PdfInfoBackupTask.kt", m80624l = {107}, m80625m = RequestParameters.X_OSS_RESTORE)
public final class C28123OooOoO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Map f99710OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C28125OooOoOO f99711OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public File f99712OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f99713OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Iterator f99714OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C28125OooOoOO f99715OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f99716OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f99717OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28123OooOoO(C28125OooOoOO c28125OooOoOO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99715OooOoo = c28125OooOoOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f99716OooOoo0 = obj;
        this.f99717OooOooO |= Integer.MIN_VALUE;
        return this.f99715OooOoo.o00000Oo(null, null, null, this);
    }
}
