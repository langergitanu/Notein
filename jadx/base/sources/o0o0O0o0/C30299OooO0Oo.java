package o0o0O0o0;

import android.util.Log;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.folder.Folder;
import com.orion.notein.domain.models.note.NoteMeta;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27600o0ooOO0;
import o0OOo0oo.o0ooOOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: renamed from: o0o0O0o0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.notelist.search.viewmodel.SearchViewModel$rename$2", m80623f = "SearchViewModel.kt", m80624l = {StyleIdentifier.LIST_TABLE_4_ACCENT_3, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_3, StyleIdentifier.LIST_TABLE_6_COLORFUL_ACCENT_4, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_4}, m80625m = "invokeSuspend")
public final class C30299OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f108018OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f108019OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f108020OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30296OooO00o f108021OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f108022OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30299OooO0Oo(int i, C30296OooO00o c30296OooO00o, String str, String str2, Continuation<? super C30299OooO0Oo> continuation) {
        super(2, continuation);
        this.f108018OooOo = i;
        this.f108021OooOoO0 = c30296OooO00o;
        this.f108020OooOoO = str;
        this.f108022OooOoOO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30299OooO0Oo(this.f108018OooOo, this.f108021OooOoO0, this.f108020OooOoO, this.f108022OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C30299OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r10.OooOO0O(r13, r2, r12) == r0) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:8:0x0020, B:42:0x0078, B:43:0x007d, B:14:0x002e, B:35:0x0068, B:37:0x006c, B:39:0x006f, B:15:0x0032, B:30:0x0058, B:32:0x005f, B:16:0x0036, B:23:0x0048, B:25:0x004c, B:27:0x004f, B:20:0x003f), top: B:47:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:8:0x0020, B:42:0x0078, B:43:0x007d, B:14:0x002e, B:35:0x0068, B:37:0x006c, B:39:0x006f, B:15:0x0032, B:30:0x0058, B:32:0x005f, B:16:0x0036, B:23:0x0048, B:25:0x004c, B:27:0x004f, B:20:0x003f), top: B:47:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:8:0x0020, B:42:0x0078, B:43:0x007d, B:14:0x002e, B:35:0x0068, B:37:0x006c, B:39:0x006f, B:15:0x0032, B:30:0x0058, B:32:0x005f, B:16:0x0036, B:23:0x0048, B:25:0x004c, B:27:0x004f, B:20:0x003f), top: B:47:0x0016 }] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Folder folder;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f108019OooOo0o;
        String str = this.f108022OooOoOO;
        String str2 = this.f108020OooOoO;
        C30296OooO00o c30296OooO00o = this.f108021OooOoO0;
        int i2 = this.f108018OooOo;
        C27600o0ooOO0 c27600o0ooOO0 = c30296OooO00o.f107990OooO0o0;
        o0ooOOo o0ooooo2 = c30296OooO00o.f107989OooO0o;
        C27449o00O0OoO c27449o00O0OoO = c30296OooO00o.f107988OooO0Oo;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                if (i2 != 0) {
                    if (i2 == 1) {
                    }
                    return Boolean.TRUE;
                }
                this.f108019OooOo0o = 1;
                obj = c27449o00O0OoO.OooOoOO(str2, this);
                if (obj == enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i == 1) {
                C32446OooOOOo.OooO0O0(obj);
            } else {
                if (i == 2) {
                    C32446OooOOOo.OooO0O0(obj);
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    o0ooooo2.OooO0Oo(str2, true);
                    if (i2 == 1) {
                        this.f108019OooOo0o = 3;
                        obj = c27600o0ooOO0.OooO0Oo(str2, this);
                        if (obj != enumC32485OooO00o) {
                            folder = (Folder) obj;
                            if (folder != null) {
                            }
                        }
                        return enumC32485OooO00o;
                    }
                    return Boolean.TRUE;
                }
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                    o0ooooo2.OooO0O0(str2);
                    return Boolean.TRUE;
                }
                C32446OooOOOo.OooO0O0(obj);
                folder = (Folder) obj;
                if (folder != null) {
                    return Boolean.FALSE;
                }
                this.f108019OooOo0o = 4;
            }
            NoteMeta noteMeta = (NoteMeta) obj;
            if (noteMeta == null) {
                return Boolean.FALSE;
            }
            this.f108019OooOo0o = 2;
            if (c27449o00O0OoO.Oooo0oo(noteMeta, str, this) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
            C32460OooOooO c32460OooOooO3 = C32460OooOooO.f116667OooO00o;
            o0ooooo2.OooO0Oo(str2, true);
            if (i2 == 1) {
            }
            return Boolean.TRUE;
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("Search", "Unable to rename it. " + C32460OooOooO.f116667OooO00o);
            return Boolean.FALSE;
        }
    }
}
