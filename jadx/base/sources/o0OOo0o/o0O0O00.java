package o0OOo0o;

import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.folder.Folder;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOo0Oo.InterfaceC27313OooOoo0;
import o0OOoooO.C28009OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.FolderUseCase$getNumOfNotesInFolderSync$2", m80623f = "FolderUseCase.kt", m80624l = {StyleIdentifier.LIST_TABLE_7_COLORFUL, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_1, StyleIdentifier.LIST_TABLE_3_ACCENT_1}, m80625m = "invokeSuspend")
public final class o0O0O00 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Integer>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C27600o0ooOO0 f96926OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f96927OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f96928OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f96929OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f96930OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ String f96931OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ C27600o0ooOO0 f96932OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O00(C27600o0ooOO0 c27600o0ooOO0, String str, Continuation<? super o0O0O00> continuation) {
        super(2, continuation);
        this.f96932OooOoo0 = c27600o0ooOO0;
        this.f96931OooOoo = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0O0O00(this.f96932OooOoo0, this.f96931OooOoo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Integer> continuation) {
        return ((o0O0O00) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r9 == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0088 -> B:29:0x008b). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        int iIntValue;
        String str;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f96930OooOoOO;
        C27600o0ooOO0 c27600o0ooOO0 = this.f96932OooOoo0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C28009OooOOOO c28009OooOOOO = c27600o0ooOO0.f96982OooO00o;
            this.f96930OooOoOO = 1;
            obj = c28009OooOOOO.OooO0Oo(this.f96931OooOoo);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else if (i == 2) {
            C32446OooOOOo.OooO0O0(obj);
            String strOooO0Oo = c27600o0ooOO0.f96984OooO0OO.OooO0Oo();
            it = ((List) obj).iterator();
            iIntValue = 0;
            str = strOooO0Oo;
            if (it.hasNext()) {
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i2 = this.f96928OooOoO;
            it = this.f96929OooOoO0;
            C27600o0ooOO0 c27600o0ooOO02 = this.f96926OooOo;
            str = this.f96927OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            c27600o0ooOO0 = c27600o0ooOO02;
            iIntValue = ((Number) obj).intValue() + i2;
            if (it.hasNext()) {
                Folder folder = (Folder) it.next();
                InterfaceC27313OooOoo0 interfaceC27313OooOoo0 = c27600o0ooOO0.f96983OooO0O0;
                String id = folder.getId();
                this.f96927OooOo0o = str;
                this.f96926OooOo = c27600o0ooOO0;
                this.f96929OooOoO0 = it;
                this.f96928OooOoO = iIntValue;
                this.f96930OooOoOO = 3;
                Object objOooO0Oo = interfaceC27313OooOoo0.OooO0Oo(id, str, this);
                if (objOooO0Oo != enumC32485OooO00o) {
                    i2 = iIntValue;
                    obj = objOooO0Oo;
                    iIntValue = ((Number) obj).intValue() + i2;
                    if (it.hasNext()) {
                        return new Integer(iIntValue);
                    }
                }
                return enumC32485OooO00o;
            }
        }
        Folder folder2 = (Folder) obj;
        if (folder2 == null) {
            return new Integer(0);
        }
        this.f96930OooOoOO = 2;
        obj = c27600o0ooOO0.OooO0o(folder2, this);
    }
}
