package o0oo000O;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import com.orion.notein.p607ui.p609vo.NoteVO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.utils.ShortcutUtils", m80623f = "ShortcutUtils.kt", m80624l = {66}, m80625m = "createNoteShortcut")
public final class OooOOO0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Context f111237OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooOOO f111238OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ShortcutManager f111239OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public NoteVO f111240OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Intent f111241OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ OooOOO f111242OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f111243OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f111244OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO0(OooOOO oooOOO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f111242OooOoo = oooOOO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f111243OooOoo0 = obj;
        this.f111244OooOooO |= Integer.MIN_VALUE;
        return this.f111242OooOoo.OooO00o(null, null, this);
    }
}
