package o0Oo0OoO;

import java.util.Collection;
import java.util.Iterator;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Oo0OoO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.task.FolderBackupTask", m80623f = "FolderBackupTask.kt", m80624l = {126, 129}, m80625m = "getWaitToRecoverFolders")
public final class C28106OooO0oO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f99603OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C28108OooOO0 f99604OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Iterator f99605OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Collection f99606OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Object f99607OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ C28108OooOO0 f99608OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f99609OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f99610OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28106OooO0oO(C28108OooOO0 c28108OooOO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99608OooOoo = c28108OooOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f99609OooOoo0 = obj;
        this.f99610OooOooO |= Integer.MIN_VALUE;
        return this.f99608OooOoo.o00000oO(null, null, null, null, this);
    }
}
