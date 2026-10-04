package o0Oo0OoO;

import java.util.ArrayList;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: o0Oo0OoO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.backup.task.FolderBackupTask", m80623f = "FolderBackupTask.kt", m80624l = {49}, m80625m = "backup")
public final class C28103OooO0Oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f99590OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C28108OooOO0 f99591OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f99592OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ArrayList f99593OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C28108OooOO0 f99594OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f99595OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28103OooO0Oo(C28108OooOO0 c28108OooOO0, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f99594OooOoOO = c28108OooOO0;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f99592OooOoO = obj;
        this.f99595OooOoo0 |= Integer.MIN_VALUE;
        return this.f99594OooOoOO.o00000Oo(null, null, this);
    }
}
