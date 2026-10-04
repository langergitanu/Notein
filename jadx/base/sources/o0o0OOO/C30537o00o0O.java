package o0o0OOO;

import com.aspose.words.TableStyleOptions;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.ColorPaperTheme;
import com.orion.notein.domain.models.papertheme.LambdaPaperTheme;
import com.orion.notein.domain.models.papertheme.MyTemplate;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOOO00.C27095OooOo0O;
import o0OOo0o.C27449o00O0OoO;
import o0o0OOOo.EnumC30546OooO0O0;
import o0oOoOo.C31041OooOOO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0o0OOO.o00o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$initializeFromPage$1", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {TableStyleOptions.DEFAULT_2003, 1557}, m80625m = "invokeSuspend")
public final class C30537o00o0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f109185OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public PaperTheme f109186OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f109187OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f109188OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ String f109189OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30537o00o0O(C30520o000000o c30520o000000o, String str, String str2, Continuation<? super C30537o00o0O> continuation) {
        super(2, continuation);
        this.f109188OooOoO0 = c30520o000000o;
        this.f109187OooOoO = str;
        this.f109189OooOoOO = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30537o00o0O(this.f109188OooOoO0, this.f109187OooOoO, this.f109189OooOoOO, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30537o00o0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd A[Catch: Exception -> 0x0179, TryCatch #0 {Exception -> 0x0179, blocks: (B:7:0x0015, B:36:0x00bf, B:37:0x00c7, B:39:0x00cd, B:43:0x00e4, B:45:0x00ea, B:47:0x00fd, B:51:0x010a, B:53:0x0119, B:55:0x012f, B:56:0x0138, B:58:0x0145, B:60:0x014f, B:64:0x0160, B:65:0x0167, B:66:0x0174, B:11:0x0025, B:17:0x003e, B:19:0x0042, B:21:0x0045, B:23:0x004b, B:25:0x004e, B:28:0x0076, B:30:0x0086, B:32:0x00a1, B:31:0x008f, B:14:0x002e), top: B:70:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea A[Catch: Exception -> 0x0179, TryCatch #0 {Exception -> 0x0179, blocks: (B:7:0x0015, B:36:0x00bf, B:37:0x00c7, B:39:0x00cd, B:43:0x00e4, B:45:0x00ea, B:47:0x00fd, B:51:0x010a, B:53:0x0119, B:55:0x012f, B:56:0x0138, B:58:0x0145, B:60:0x014f, B:64:0x0160, B:65:0x0167, B:66:0x0174, B:11:0x0025, B:17:0x003e, B:19:0x0042, B:21:0x0045, B:23:0x004b, B:25:0x004e, B:28:0x0076, B:30:0x0086, B:32:0x00a1, B:31:0x008f, B:14:0x002e), top: B:70:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0119 A[Catch: Exception -> 0x0179, TryCatch #0 {Exception -> 0x0179, blocks: (B:7:0x0015, B:36:0x00bf, B:37:0x00c7, B:39:0x00cd, B:43:0x00e4, B:45:0x00ea, B:47:0x00fd, B:51:0x010a, B:53:0x0119, B:55:0x012f, B:56:0x0138, B:58:0x0145, B:60:0x014f, B:64:0x0160, B:65:0x0167, B:66:0x0174, B:11:0x0025, B:17:0x003e, B:19:0x0042, B:21:0x0045, B:23:0x004b, B:25:0x004e, B:28:0x0076, B:30:0x0086, B:32:0x00a1, B:31:0x008f, B:14:0x002e), top: B:70:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e3 A[SYNTHETIC] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objOoooO0;
        PaperTheme paperTheme;
        Object objOooO0o0;
        PaperTheme paperTheme2;
        Iterator it;
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109185OooOo;
        C30520o000000o c30520o000000o = this.f109188OooOoO0;
        C33781o00o0O c33781o00o0O = c30520o000000o.f109029Oooo00O;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C27449o00O0OoO c27449o00O0OoO = c30520o000000o.f109005OooOO0O;
            String str = this.f109187OooOoO;
            String str2 = this.f109189OooOoOO;
            this.f109185OooOo = 1;
            objOoooO0 = c27449o00O0OoO.OoooO0(str, str2, this);
            if (objOoooO0 == enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PaperTheme paperTheme3 = this.f109186OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            objOooO0o0 = obj;
            paperTheme2 = paperTheme3;
            it = ((List) objOooO0o0).iterator();
            while (true) {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((MyTemplate) next).getId(), paperTheme2.getMyTemplateId())) {
                    break;
                }
            }
            MyTemplate myTemplate = (MyTemplate) next;
            C33781o00o0O c33781o00o0O2 = c30520o000000o.f109040OoooO0O;
            MyTemplate myTemplate2 = myTemplate != null ? new MyTemplate(null, paperTheme2, null, 0L, 0L, null, 61, null) : myTemplate;
            c33781o00o0O2.getClass();
            c33781o00o0O2.OooOO0(null, myTemplate2);
            C33781o00o0O c33781o00o0O3 = c30520o000000o.f109041OoooOO0;
            Integer num = new Integer(myTemplate == null ? 1 : 0);
            c33781o00o0O3.getClass();
            c33781o00o0O3.OooOO0(null, num);
            if (paperTheme2 instanceof LambdaPaperTheme) {
                int id = ((LambdaPaperTheme) paperTheme2).getCategory().getId();
                PaperTheme baseTheme = ((LambdaPaperTheme) paperTheme2).getBaseTheme();
                if (baseTheme instanceof ColorPaperTheme) {
                    c30520o000000o.OooOo(((ColorPaperTheme) baseTheme).getColor(), id);
                }
                C32443OooOOO c32443OooOOOOooO0oO = C30520o000000o.OooO0oO(c30520o000000o, ((LambdaPaperTheme) paperTheme2).getPaperStyle());
                if (c32443OooOOOOooO0oO != null) {
                    Float f = (Float) c32443OooOOOOooO0oO.f116638OooOo0o;
                    Float f2 = (Float) c32443OooOOOOooO0oO.f116637OooOo;
                    int iFloatValue = f != null ? (int) (f.floatValue() / Oooo0.o000000O.OooO0oO(1)) : 25;
                    int iFloatValue2 = f2 != null ? (int) (f2.floatValue() * 100) : 100;
                    C33781o00o0O c33781o00o0O4 = c30520o000000o.f109014OooOo;
                    C31041OooOOO c31041OooOOO = new C31041OooOOO(iFloatValue, iFloatValue2);
                    c33781o00o0O4.getClass();
                    c33781o00o0O4.OooOO0(null, c31041OooOOO);
                }
            }
            c30520o000000o.f109056o000oOoO.setValue(paperTheme2);
            return C32460OooOooO.f116667OooO00o;
        }
        C32446OooOOOo.OooO0O0(obj);
        objOoooO0 = obj;
        Page page = (Page) objOoooO0;
        if (page != null && (paperTheme = page.getPaperTheme()) != null) {
            c30520o000000o.f109009OooOOOO.setValue(page.getPaperOrientation());
            c30520o000000o.f109012OooOOo0.setValue(page.getPaperSpec().getName());
            boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(page.getPaperSpec(), PaperSpec.INSTANCE.getUNBOUNDED());
            C33781o00o0O c33781o00o0O5 = c30520o000000o.f109015OooOo0;
            if (zOooO0O0) {
                Boolean bool = Boolean.TRUE;
                c33781o00o0O5.getClass();
                c33781o00o0O5.OooOO0(null, bool);
                if (c33781o00o0O.getValue() == EnumC30546OooO0O0.f109264OooOo0o) {
                    EnumC30546OooO0O0 enumC30546OooO0O0 = EnumC30546OooO0O0.f109263OooOo;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, enumC30546OooO0O0);
                }
            } else {
                c30520o000000o.f109011OooOOo = page.getPaperSpec().getName();
                Boolean bool2 = Boolean.FALSE;
                c33781o00o0O5.getClass();
                c33781o00o0O5.OooOO0(null, bool2);
            }
            C33781o00o0O c33781o00o0O6 = c30520o000000o.f109007OooOOO;
            c33781o00o0O6.getClass();
            c33781o00o0O6.OooOO0(null, paperTheme);
            C33781o00o0O c33781o00o0O7 = c30520o000000o.f109028Oooo000;
            c33781o00o0O7.getClass();
            c33781o00o0O7.OooOO0(null, paperTheme);
            C27095OooOo0O c27095OooOo0O = c30520o000000o.f109001OooO0o0;
            this.f109186OooOo0o = paperTheme;
            this.f109185OooOo = 2;
            objOooO0o0 = c27095OooOo0O.OooO0o0(this);
            if (objOooO0o0 != enumC32485OooO00o) {
                paperTheme2 = paperTheme;
                it = ((List) objOooO0o0).iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                MyTemplate myTemplate3 = (MyTemplate) next;
                C33781o00o0O c33781o00o0O22 = c30520o000000o.f109040OoooO0O;
                if (myTemplate3 != null) {
                }
                c33781o00o0O22.getClass();
                c33781o00o0O22.OooOO0(null, myTemplate2);
                C33781o00o0O c33781o00o0O32 = c30520o000000o.f109041OoooOO0;
                Integer num2 = new Integer(myTemplate3 == null ? 1 : 0);
                c33781o00o0O32.getClass();
                c33781o00o0O32.OooOO0(null, num2);
                if (paperTheme2 instanceof LambdaPaperTheme) {
                }
                c30520o000000o.f109056o000oOoO.setValue(paperTheme2);
                return C32460OooOooO.f116667OooO00o;
            }
            return enumC32485OooO00o;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
