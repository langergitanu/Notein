package o0OOo0o;

import com.orion.notein.domain.models.note.Note;
import java.io.File;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0OOo0o.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.BackupUseCase", m80623f = "BackupUseCase.kt", m80624l = {568}, m80625m = "backupNote")
public final class C27334OooOOOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Note f95130OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C27351Oooo0O0 f95131OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f95132OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public File f95133OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f95134OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C27351Oooo0O0 f95135OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f95136OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f95137OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27334OooOOOo(C27351Oooo0O0 c27351Oooo0O0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f95135OooOoo = c27351Oooo0O0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f95136OooOoo0 = obj;
        this.f95137OooOooO |= Integer.MIN_VALUE;
        return C27351Oooo0O0.OooO0O0(this.f95135OooOoo, null, null, null, this);
    }
}
