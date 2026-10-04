package o0OO0o0;

import com.aspose.words.StyleIdentifier;
import java.util.LinkedHashMap;
import oO00ooO.C32445OooOOOO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: o0OO0o0.o000000o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.cloudsync.onedrive.OneDriveDriveSyncBackend", m80623f = "OneDriveDriveSyncBackend.kt", m80624l = {StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6, StyleIdentifier.LIST_TABLE_2_ACCENT_2}, m80625m = "uploadMeta-0E7RQCE")
public final class C26861o000000o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f93008OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f93009OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public LinkedHashMap f93010OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f93011OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f93012OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f93013OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ o00oO0O f93014OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26861o000000o(o00oO0O o00oo0o, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f93014OooOoo0 = o00oo0o;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f93012OooOoOO = obj;
        this.f93013OooOoo |= Integer.MIN_VALUE;
        Object objOooO0oO = this.f93014OooOoo0.OooO0oO(null, null, this);
        return objOooO0oO == EnumC32485OooO00o.f116726OooOo0o ? objOooO0oO : new C32445OooOOOO(objOooO0oO);
    }
}
