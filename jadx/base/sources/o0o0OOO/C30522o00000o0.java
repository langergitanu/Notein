package o0o0OOO;

import android.graphics.Rect;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PaperSpec;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.domain.models.papertheme.PdfPaperTheme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import o0OOo0o.C27449o00O0OoO;
import o0OOo0o.C27457o00O0o0o;
import o0OOo0o.C27585o00ooO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0o0OOO.o00000o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.paperconfig.PaperConfigDialogViewModel$updatePageTheme$2", m80623f = "PaperConfigDialogViewModel.kt", m80624l = {2194, 2196, 2237, 2252, 2253, 2264, 2265, 2271}, m80625m = "invokeSuspend")
public final class C30522o00000o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f109078OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f109079OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Object f109080OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f109081OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Object f109082OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Iterator f109083OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Collection f109084OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public Page f109085OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public Page f109086OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final /* synthetic */ String f109087Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f109088Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final /* synthetic */ C30520o000000o f109089Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final /* synthetic */ String f109090Oooo00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30522o00000o0(C30520o000000o c30520o000000o, String str, String str2, Continuation<? super C30522o00000o0> continuation) {
        super(2, continuation);
        this.f109089Oooo00O = c30520o000000o;
        this.f109090Oooo00o = str;
        this.f109087Oooo0 = str2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30522o00000o0(this.f109089Oooo00O, this.f109090Oooo00o, this.f109087Oooo0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C30522o00000o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x044d, code lost:
    
        if (r3.OooO00o(r2, r4, true, r39) == r1) goto L116;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03fd A[Catch: Exception -> 0x0452, TryCatch #0 {Exception -> 0x0452, blocks: (B:6:0x0017, B:9:0x0030, B:93:0x0388, B:95:0x038e, B:96:0x03a0, B:98:0x03a6, B:100:0x03b8, B:101:0x03bc, B:105:0x03e4, B:108:0x03fd, B:109:0x040e, B:111:0x0414, B:112:0x0422, B:114:0x042f, B:13:0x0051, B:16:0x0077, B:76:0x0282, B:79:0x028c, B:90:0x036a, B:43:0x013d, B:45:0x0143, B:47:0x0151, B:49:0x0159, B:53:0x0166, B:55:0x0184, B:57:0x01a5, B:59:0x01ab, B:61:0x01c3, B:63:0x01e3, B:66:0x01f2, B:70:0x024f, B:72:0x0253, B:80:0x0294, B:84:0x0343, B:87:0x0351, B:52:0x0160, B:92:0x0371, B:19:0x009a, B:22:0x00c1, B:23:0x00c9, B:37:0x010e, B:38:0x0112, B:40:0x0118, B:42:0x011b, B:24:0x00cf, B:33:0x00f2, B:27:0x00d8, B:30:0x00e8, B:34:0x00f5), top: B:121:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118 A[Catch: Exception -> 0x0452, TryCatch #0 {Exception -> 0x0452, blocks: (B:6:0x0017, B:9:0x0030, B:93:0x0388, B:95:0x038e, B:96:0x03a0, B:98:0x03a6, B:100:0x03b8, B:101:0x03bc, B:105:0x03e4, B:108:0x03fd, B:109:0x040e, B:111:0x0414, B:112:0x0422, B:114:0x042f, B:13:0x0051, B:16:0x0077, B:76:0x0282, B:79:0x028c, B:90:0x036a, B:43:0x013d, B:45:0x0143, B:47:0x0151, B:49:0x0159, B:53:0x0166, B:55:0x0184, B:57:0x01a5, B:59:0x01ab, B:61:0x01c3, B:63:0x01e3, B:66:0x01f2, B:70:0x024f, B:72:0x0253, B:80:0x0294, B:84:0x0343, B:87:0x0351, B:52:0x0160, B:92:0x0371, B:19:0x009a, B:22:0x00c1, B:23:0x00c9, B:37:0x010e, B:38:0x0112, B:40:0x0118, B:42:0x011b, B:24:0x00cf, B:33:0x00f2, B:27:0x00d8, B:30:0x00e8, B:34:0x00f5), top: B:121:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011b A[Catch: Exception -> 0x0452, TryCatch #0 {Exception -> 0x0452, blocks: (B:6:0x0017, B:9:0x0030, B:93:0x0388, B:95:0x038e, B:96:0x03a0, B:98:0x03a6, B:100:0x03b8, B:101:0x03bc, B:105:0x03e4, B:108:0x03fd, B:109:0x040e, B:111:0x0414, B:112:0x0422, B:114:0x042f, B:13:0x0051, B:16:0x0077, B:76:0x0282, B:79:0x028c, B:90:0x036a, B:43:0x013d, B:45:0x0143, B:47:0x0151, B:49:0x0159, B:53:0x0166, B:55:0x0184, B:57:0x01a5, B:59:0x01ab, B:61:0x01c3, B:63:0x01e3, B:66:0x01f2, B:70:0x024f, B:72:0x0253, B:80:0x0294, B:84:0x0343, B:87:0x0351, B:52:0x0160, B:92:0x0371, B:19:0x009a, B:22:0x00c1, B:23:0x00c9, B:37:0x010e, B:38:0x0112, B:40:0x0118, B:42:0x011b, B:24:0x00cf, B:33:0x00f2, B:27:0x00d8, B:30:0x00e8, B:34:0x00f5), top: B:121:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0143 A[Catch: Exception -> 0x0452, TryCatch #0 {Exception -> 0x0452, blocks: (B:6:0x0017, B:9:0x0030, B:93:0x0388, B:95:0x038e, B:96:0x03a0, B:98:0x03a6, B:100:0x03b8, B:101:0x03bc, B:105:0x03e4, B:108:0x03fd, B:109:0x040e, B:111:0x0414, B:112:0x0422, B:114:0x042f, B:13:0x0051, B:16:0x0077, B:76:0x0282, B:79:0x028c, B:90:0x036a, B:43:0x013d, B:45:0x0143, B:47:0x0151, B:49:0x0159, B:53:0x0166, B:55:0x0184, B:57:0x01a5, B:59:0x01ab, B:61:0x01c3, B:63:0x01e3, B:66:0x01f2, B:70:0x024f, B:72:0x0253, B:80:0x0294, B:84:0x0343, B:87:0x0351, B:52:0x0160, B:92:0x0371, B:19:0x009a, B:22:0x00c1, B:23:0x00c9, B:37:0x010e, B:38:0x0112, B:40:0x0118, B:42:0x011b, B:24:0x00cf, B:33:0x00f2, B:27:0x00d8, B:30:0x00e8, B:34:0x00f5), top: B:121:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0253 A[Catch: Exception -> 0x0452, TryCatch #0 {Exception -> 0x0452, blocks: (B:6:0x0017, B:9:0x0030, B:93:0x0388, B:95:0x038e, B:96:0x03a0, B:98:0x03a6, B:100:0x03b8, B:101:0x03bc, B:105:0x03e4, B:108:0x03fd, B:109:0x040e, B:111:0x0414, B:112:0x0422, B:114:0x042f, B:13:0x0051, B:16:0x0077, B:76:0x0282, B:79:0x028c, B:90:0x036a, B:43:0x013d, B:45:0x0143, B:47:0x0151, B:49:0x0159, B:53:0x0166, B:55:0x0184, B:57:0x01a5, B:59:0x01ab, B:61:0x01c3, B:63:0x01e3, B:66:0x01f2, B:70:0x024f, B:72:0x0253, B:80:0x0294, B:84:0x0343, B:87:0x0351, B:52:0x0160, B:92:0x0371, B:19:0x009a, B:22:0x00c1, B:23:0x00c9, B:37:0x010e, B:38:0x0112, B:40:0x0118, B:42:0x011b, B:24:0x00cf, B:33:0x00f2, B:27:0x00d8, B:30:0x00e8, B:34:0x00f5), top: B:121:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0351 A[Catch: Exception -> 0x0452, TryCatch #0 {Exception -> 0x0452, blocks: (B:6:0x0017, B:9:0x0030, B:93:0x0388, B:95:0x038e, B:96:0x03a0, B:98:0x03a6, B:100:0x03b8, B:101:0x03bc, B:105:0x03e4, B:108:0x03fd, B:109:0x040e, B:111:0x0414, B:112:0x0422, B:114:0x042f, B:13:0x0051, B:16:0x0077, B:76:0x0282, B:79:0x028c, B:90:0x036a, B:43:0x013d, B:45:0x0143, B:47:0x0151, B:49:0x0159, B:53:0x0166, B:55:0x0184, B:57:0x01a5, B:59:0x01ab, B:61:0x01c3, B:63:0x01e3, B:66:0x01f2, B:70:0x024f, B:72:0x0253, B:80:0x0294, B:84:0x0343, B:87:0x0351, B:52:0x0160, B:92:0x0371, B:19:0x009a, B:22:0x00c1, B:23:0x00c9, B:37:0x010e, B:38:0x0112, B:40:0x0118, B:42:0x011b, B:24:0x00cf, B:33:0x00f2, B:27:0x00d8, B:30:0x00e8, B:34:0x00f5), top: B:121:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x036a A[Catch: Exception -> 0x0452, TryCatch #0 {Exception -> 0x0452, blocks: (B:6:0x0017, B:9:0x0030, B:93:0x0388, B:95:0x038e, B:96:0x03a0, B:98:0x03a6, B:100:0x03b8, B:101:0x03bc, B:105:0x03e4, B:108:0x03fd, B:109:0x040e, B:111:0x0414, B:112:0x0422, B:114:0x042f, B:13:0x0051, B:16:0x0077, B:76:0x0282, B:79:0x028c, B:90:0x036a, B:43:0x013d, B:45:0x0143, B:47:0x0151, B:49:0x0159, B:53:0x0166, B:55:0x0184, B:57:0x01a5, B:59:0x01ab, B:61:0x01c3, B:63:0x01e3, B:66:0x01f2, B:70:0x024f, B:72:0x0253, B:80:0x0294, B:84:0x0343, B:87:0x0351, B:52:0x0160, B:92:0x0371, B:19:0x009a, B:22:0x00c1, B:23:0x00c9, B:37:0x010e, B:38:0x0112, B:40:0x0118, B:42:0x011b, B:24:0x00cf, B:33:0x00f2, B:27:0x00d8, B:30:0x00e8, B:34:0x00f5), top: B:121:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0371 A[Catch: Exception -> 0x0452, TryCatch #0 {Exception -> 0x0452, blocks: (B:6:0x0017, B:9:0x0030, B:93:0x0388, B:95:0x038e, B:96:0x03a0, B:98:0x03a6, B:100:0x03b8, B:101:0x03bc, B:105:0x03e4, B:108:0x03fd, B:109:0x040e, B:111:0x0414, B:112:0x0422, B:114:0x042f, B:13:0x0051, B:16:0x0077, B:76:0x0282, B:79:0x028c, B:90:0x036a, B:43:0x013d, B:45:0x0143, B:47:0x0151, B:49:0x0159, B:53:0x0166, B:55:0x0184, B:57:0x01a5, B:59:0x01ab, B:61:0x01c3, B:63:0x01e3, B:66:0x01f2, B:70:0x024f, B:72:0x0253, B:80:0x0294, B:84:0x0343, B:87:0x0351, B:52:0x0160, B:92:0x0371, B:19:0x009a, B:22:0x00c1, B:23:0x00c9, B:37:0x010e, B:38:0x0112, B:40:0x0118, B:42:0x011b, B:24:0x00cf, B:33:0x00f2, B:27:0x00d8, B:30:0x00e8, B:34:0x00f5), top: B:121:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x038e A[Catch: Exception -> 0x0452, TryCatch #0 {Exception -> 0x0452, blocks: (B:6:0x0017, B:9:0x0030, B:93:0x0388, B:95:0x038e, B:96:0x03a0, B:98:0x03a6, B:100:0x03b8, B:101:0x03bc, B:105:0x03e4, B:108:0x03fd, B:109:0x040e, B:111:0x0414, B:112:0x0422, B:114:0x042f, B:13:0x0051, B:16:0x0077, B:76:0x0282, B:79:0x028c, B:90:0x036a, B:43:0x013d, B:45:0x0143, B:47:0x0151, B:49:0x0159, B:53:0x0166, B:55:0x0184, B:57:0x01a5, B:59:0x01ab, B:61:0x01c3, B:63:0x01e3, B:66:0x01f2, B:70:0x024f, B:72:0x0253, B:80:0x0294, B:84:0x0343, B:87:0x0351, B:52:0x0160, B:92:0x0371, B:19:0x009a, B:22:0x00c1, B:23:0x00c9, B:37:0x010e, B:38:0x0112, B:40:0x0118, B:42:0x011b, B:24:0x00cf, B:33:0x00f2, B:27:0x00d8, B:30:0x00e8, B:34:0x00f5), top: B:121:0x000c }] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x03fa -> B:11:0x0034). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0251 -> B:79:0x028c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0280 -> B:76:0x0282). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x034b -> B:89:0x0368). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0351 -> B:88:0x035f). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOooO0o;
        Object objOooOooO;
        List listOooO0oO;
        PaperTheme paperThemeOooOOO;
        C30520o000000o c30520o000000o;
        Map map;
        PaperSpec paperSpec;
        Iterator it;
        Collection collection;
        String str;
        Page page;
        Page page2;
        Collection collection2;
        PaperSpec paperSpec2;
        PaperTheme paperTheme;
        Map map2;
        Object objOooO0o2;
        String str2;
        C30520o000000o c30520o000000o2;
        Map map3;
        PaperSpec paperSpec3;
        PaperTheme paperTheme2;
        Collection collection3;
        Object objOoooO0;
        Iterator it2;
        Collection collection4;
        Page page3;
        Page page4;
        Object objOooO0o3;
        List list;
        Iterator it3;
        Map map4;
        String str3;
        C30520o000000o c30520o000000o3;
        Collection collection5;
        String str4;
        int i;
        Float f;
        List list2;
        C30520o000000o c30520o000000o4;
        List list3;
        Map map5;
        C27449o00O0OoO c27449o00O0OoO;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f109088Oooo000;
        String str5 = null;
        String str6 = this.f109090Oooo00o;
        boolean z = true;
        C30520o000000o c30520o000000o5 = this.f109089Oooo00O;
        try {
        } catch (Exception unused) {
            z = false;
        }
        switch (i2) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                int iIntValue = ((Number) c30520o000000o5.f109023OooOoo0.getValue()).intValue();
                C27449o00O0OoO c27449o00O0OoO2 = c30520o000000o5.f109005OooOO0O;
                if (iIntValue == 1) {
                    this.f109088Oooo000 = 1;
                    objOooOooO = c27449o00O0OoO2.OooOooO(str6, this);
                    if (objOooOooO == enumC32485OooO00o) {
                    }
                    listOooO0oO = (List) objOooOooO;
                    paperThemeOooOOO = c30520o000000o5.OooOOO();
                    if (paperThemeOooOOO != null) {
                        return Boolean.FALSE;
                    }
                    PaperSpec paperSpecOooOOo = C30520o000000o.OooOOo((String) c30520o000000o5.f109012OooOOo0.getValue());
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ArrayList arrayList = new ArrayList();
                    c30520o000000o = c30520o000000o5;
                    map = linkedHashMap;
                    paperSpec = paperSpecOooOOo;
                    it = listOooO0oO.iterator();
                    collection = arrayList;
                    str = str6;
                    if (it.hasNext()) {
                        Page page5 = (Page) it.next();
                        List<String> historyPageIdList = page5.getHistoryPageIdList();
                        String str7 = historyPageIdList != null ? (String) oOo000Oo.OooOo.Oooo(historyPageIdList) : str5;
                        ?? source = paperThemeOooOOO instanceof PdfPaperTheme ? z : page5.getSource();
                        Rect unrotatedPaperPadding = page5.getUnrotatedPaperPadding();
                        int width = paperSpec.getWidth() + unrotatedPaperPadding.left + unrotatedPaperPadding.right;
                        int height = paperSpec.getHeight() + unrotatedPaperPadding.top + unrotatedPaperPadding.bottom;
                        Float preciseWidth = paperSpec.getPreciseWidth();
                        if (preciseWidth != null) {
                            collection5 = collection;
                            f = new Float(unrotatedPaperPadding.left + unrotatedPaperPadding.right + preciseWidth.floatValue());
                            str4 = str7;
                            i = width;
                        } else {
                            collection5 = collection;
                            str4 = str7;
                            i = width;
                            f = null;
                        }
                        Float preciseHeight = paperSpec.getPreciseHeight();
                        Float f2 = preciseHeight != null ? new Float(unrotatedPaperPadding.top + unrotatedPaperPadding.bottom + preciseHeight.floatValue()) : null;
                        String str8 = str;
                        C30520o000000o c30520o000000o6 = c30520o000000o;
                        Map map6 = map;
                        PaperTheme paperTheme3 = paperThemeOooOOO;
                        String str9 = str4;
                        PaperSpec paperSpecCopy$default = PaperSpec.copy$default(paperSpec, null, null, false, i, height, f, f2, 0, 0, 391, null);
                        if (str9 == null || str9.length() == 0) {
                            ?? r7 = source;
                            String string = UUID.randomUUID().toString();
                            kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
                            Page pageCopy$default = Page.copy$default(page5, string, "", null, null, null, null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, null, null, 458748, null);
                            page2 = pageCopy$default;
                            Page pageCopy$default2 = Page.copy$default(page5, null, null, paperSpecCopy$default, paperTheme3.getOrientation(), paperTheme3, null, null, null, false, r7 == true ? 1 : 0, 0L, 0L, null, null, 0, false, com.facebook.soloader.OooOo.OooO0oO(pageCopy$default.getId()), null, null, 458211, null);
                            this.f109079OooOo0o = paperTheme3;
                            this.f109078OooOo = paperSpec;
                            this.f109081OooOoO0 = map6;
                            this.f109080OooOoO = c30520o000000o6;
                            this.f109082OooOoOO = str8;
                            this.f109084OooOoo0 = collection5;
                            this.f109083OooOoo = it;
                            this.f109085OooOooO = page2;
                            this.f109086OooOooo = pageCopy$default2;
                            this.f109088Oooo000 = 3;
                            Object obj2 = C30520o000000o.f108997ooOO;
                            c30520o000000o6.getClass();
                            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                            objOooO0o2 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30540o0ooOO0(pageCopy$default2, page5, null), this);
                            if (objOooO0o2 != enumC32485OooO00o) {
                                paperSpec2 = paperSpec;
                                paperTheme = paperTheme3;
                                collection2 = collection5;
                                c30520o000000o = c30520o000000o6;
                                map2 = map6;
                                page = pageCopy$default2;
                                str = str8;
                                if (((Boolean) objOooO0o2).booleanValue()) {
                                    map2.put(page.getId(), page2);
                                    it2 = it;
                                    collection4 = collection2;
                                    str2 = str;
                                    c30520o000000o2 = c30520o000000o;
                                    paperSpec3 = paperSpec2;
                                    paperTheme2 = paperTheme;
                                    map3 = map2;
                                    C30520o000000o c30520o000000o7 = c30520o000000o2;
                                    str = str2;
                                    paperSpec = paperSpec3;
                                    map = map3;
                                    c30520o000000o = c30520o000000o7;
                                    page3 = page;
                                    collection = collection4;
                                    it = it2;
                                    paperThemeOooOOO = paperTheme2;
                                    if (page3 != null) {
                                    }
                                    str5 = null;
                                    z = true;
                                    if (it.hasNext()) {
                                    }
                                } else {
                                    map = map2;
                                    collection = collection2;
                                    paperSpec = paperSpec2;
                                    paperThemeOooOOO = paperTheme;
                                    page3 = null;
                                    if (page3 != null) {
                                        collection.add(page3);
                                    }
                                    str5 = null;
                                    z = true;
                                    if (it.hasNext()) {
                                    }
                                }
                            }
                        } else {
                            Page pageCopy$default3 = Page.copy$default(page5, null, null, paperSpecCopy$default, paperTheme3.getOrientation(), paperTheme3, null, null, null, false, source == true ? 1 : 0, 0L, 0L, null, null, 0, false, null, null, null, 523747, null);
                            C27449o00O0OoO c27449o00O0OoO3 = c30520o000000o6.f109005OooOO0O;
                            this.f109079OooOo0o = paperTheme3;
                            this.f109078OooOo = paperSpec;
                            this.f109081OooOoO0 = map6;
                            this.f109080OooOoO = c30520o000000o6;
                            this.f109082OooOoOO = str8;
                            this.f109084OooOoo0 = collection5;
                            this.f109083OooOoo = it;
                            this.f109085OooOooO = pageCopy$default3;
                            this.f109086OooOooo = null;
                            this.f109088Oooo000 = 4;
                            objOoooO0 = c27449o00O0OoO3.OoooO0(str9, str8, this);
                            if (objOoooO0 != enumC32485OooO00o) {
                                paperSpec3 = paperSpec;
                                paperTheme2 = paperTheme3;
                                map3 = map6;
                                str2 = str8;
                                page = pageCopy$default3;
                                c30520o000000o2 = c30520o000000o6;
                                collection3 = collection5;
                                page4 = (Page) objOoooO0;
                                if (page4 != null) {
                                    this.f109079OooOo0o = paperTheme2;
                                    this.f109078OooOo = paperSpec3;
                                    this.f109081OooOoO0 = map3;
                                    this.f109080OooOoO = c30520o000000o2;
                                    this.f109082OooOoOO = str2;
                                    this.f109084OooOoo0 = collection3;
                                    this.f109083OooOoo = it;
                                    this.f109085OooOooO = page;
                                    this.f109088Oooo000 = 5;
                                    Object obj3 = C30520o000000o.f108997ooOO;
                                    c30520o000000o2.getClass();
                                    C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                                    objOooO0o3 = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30540o0ooOO0(page, page4, null), this);
                                    if (objOooO0o3 != enumC32485OooO00o) {
                                        it2 = it;
                                        collection4 = collection3;
                                        if (((Boolean) objOooO0o3).booleanValue()) {
                                            collection3 = collection4;
                                            it = it2;
                                        }
                                        C30520o000000o c30520o000000o72 = c30520o000000o2;
                                        str = str2;
                                        paperSpec = paperSpec3;
                                        map = map3;
                                        c30520o000000o = c30520o000000o72;
                                        page3 = page;
                                        collection = collection4;
                                        it = it2;
                                        paperThemeOooOOO = paperTheme2;
                                        if (page3 != null) {
                                        }
                                        str5 = null;
                                        z = true;
                                        if (it.hasNext()) {
                                        }
                                    }
                                }
                                page.setHistoryPageIdList(null);
                                it2 = it;
                                collection4 = collection3;
                                C30520o000000o c30520o000000o722 = c30520o000000o2;
                                str = str2;
                                paperSpec = paperSpec3;
                                map = map3;
                                c30520o000000o = c30520o000000o722;
                                page3 = page;
                                collection = collection4;
                                it = it2;
                                paperThemeOooOOO = paperTheme2;
                                if (page3 != null) {
                                }
                                str5 = null;
                                z = true;
                                if (it.hasNext()) {
                                }
                            }
                        }
                    } else {
                        list = (List) collection;
                        it3 = oOo000Oo.OooOo.Oooo00O(list, 100).iterator();
                        map4 = map;
                        str3 = str6;
                        c30520o000000o3 = c30520o000000o5;
                        if (!it3.hasNext()) {
                            List list4 = (List) it3.next();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it4 = list4.iterator();
                            while (it4.hasNext()) {
                                Page page6 = (Page) map4.get(((Page) it4.next()).getId());
                                if (page6 != null) {
                                    arrayList2.add(page6);
                                }
                            }
                            C27449o00O0OoO c27449o00O0OoO4 = c30520o000000o3.f109005OooOO0O;
                            this.f109079OooOo0o = map4;
                            this.f109078OooOo = list;
                            this.f109081OooOoO0 = c30520o000000o3;
                            this.f109080OooOoO = str3;
                            this.f109082OooOoOO = it3;
                            this.f109084OooOoo0 = list4;
                            this.f109083OooOoo = null;
                            this.f109085OooOooO = null;
                            this.f109086OooOooo = null;
                            this.f109088Oooo000 = 6;
                            if (c27449o00O0OoO4.OooOO0O(str3, arrayList2, this) != enumC32485OooO00o) {
                                c30520o000000o4 = c30520o000000o3;
                                list2 = list4;
                                list3 = list;
                                map5 = map4;
                                c27449o00O0OoO = c30520o000000o4.f109005OooOO0O;
                                this.f109079OooOo0o = map5;
                                this.f109078OooOo = list3;
                                this.f109081OooOoO0 = c30520o000000o4;
                                this.f109080OooOoO = str3;
                                this.f109082OooOoOO = it3;
                                this.f109084OooOoo0 = null;
                                this.f109088Oooo000 = 7;
                                if (c27449o00O0OoO.OoooO0O(str3, list2, this) == enumC32485OooO00o) {
                                }
                                c30520o000000o3 = c30520o000000o4;
                                list = list3;
                                map4 = map5;
                                if (!it3.hasNext()) {
                                    List list5 = list;
                                    ArrayList arrayList3 = new ArrayList(C34428OooOOo.OooOOoo(list5, 10));
                                    Iterator it5 = list5.iterator();
                                    while (it5.hasNext()) {
                                        arrayList3.add(((Page) it5.next()).getId());
                                    }
                                    Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList3);
                                    if (!setO0OO00O.isEmpty()) {
                                        C27585o00ooO0 c27585o00ooO0 = c30520o000000o5.f109006OooOO0o;
                                        this.f109079OooOo0o = null;
                                        this.f109078OooOo = null;
                                        this.f109081OooOoO0 = null;
                                        this.f109080OooOoO = null;
                                        this.f109082OooOoOO = null;
                                        this.f109084OooOoo0 = null;
                                        this.f109083OooOoo = null;
                                        this.f109085OooOooO = null;
                                        this.f109086OooOooo = null;
                                        this.f109088Oooo000 = 8;
                                        z = true;
                                        break;
                                    } else {
                                        z = true;
                                    }
                                    return Boolean.valueOf(z);
                                }
                            }
                        }
                    }
                } else {
                    String str10 = this.f109087Oooo0;
                    this.f109088Oooo000 = 2;
                    c27449o00O0OoO2.getClass();
                    C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                    objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C27457o00O0o0o(str10, str6, null, c27449o00O0OoO2), this);
                    if (objOooO0o == enumC32485OooO00o) {
                    }
                    listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(objOooO0o);
                    paperThemeOooOOO = c30520o000000o5.OooOOO();
                    if (paperThemeOooOOO != null) {
                    }
                }
                return enumC32485OooO00o;
            case 1:
                C32446OooOOOo.OooO0O0(obj);
                objOooOooO = obj;
                listOooO0oO = (List) objOooOooO;
                paperThemeOooOOO = c30520o000000o5.OooOOO();
                if (paperThemeOooOOO != null) {
                }
                break;
            case 2:
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o = obj;
                listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(objOooO0o);
                paperThemeOooOOO = c30520o000000o5.OooOOO();
                if (paperThemeOooOOO != null) {
                }
                break;
            case 3:
                page = this.f109086OooOooo;
                page2 = this.f109085OooOooO;
                it = this.f109083OooOoo;
                collection2 = this.f109084OooOoo0;
                str = (String) this.f109082OooOoOO;
                c30520o000000o = (C30520o000000o) this.f109080OooOoO;
                Map map7 = (Map) this.f109081OooOoO0;
                paperSpec2 = (PaperSpec) this.f109078OooOo;
                paperTheme = (PaperTheme) this.f109079OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                map2 = map7;
                objOooO0o2 = obj;
                if (((Boolean) objOooO0o2).booleanValue()) {
                }
                break;
            case 4:
                page = this.f109085OooOooO;
                Iterator it6 = this.f109083OooOoo;
                Collection collection6 = this.f109084OooOoo0;
                str2 = (String) this.f109082OooOoOO;
                c30520o000000o2 = (C30520o000000o) this.f109080OooOoO;
                map3 = (Map) this.f109081OooOoO0;
                paperSpec3 = (PaperSpec) this.f109078OooOo;
                paperTheme2 = (PaperTheme) this.f109079OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                collection3 = collection6;
                it = it6;
                objOoooO0 = obj;
                page4 = (Page) objOoooO0;
                if (page4 != null) {
                }
                page.setHistoryPageIdList(null);
                it2 = it;
                collection4 = collection3;
                C30520o000000o c30520o000000o7222 = c30520o000000o2;
                str = str2;
                paperSpec = paperSpec3;
                map = map3;
                c30520o000000o = c30520o000000o7222;
                page3 = page;
                collection = collection4;
                it = it2;
                paperThemeOooOOO = paperTheme2;
                if (page3 != null) {
                }
                str5 = null;
                z = true;
                if (it.hasNext()) {
                }
                break;
            case 5:
                page = this.f109085OooOooO;
                it2 = this.f109083OooOoo;
                collection4 = this.f109084OooOoo0;
                str2 = (String) this.f109082OooOoOO;
                c30520o000000o2 = (C30520o000000o) this.f109080OooOoO;
                map3 = (Map) this.f109081OooOoO0;
                paperSpec3 = (PaperSpec) this.f109078OooOo;
                paperTheme2 = (PaperTheme) this.f109079OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o3 = obj;
                if (((Boolean) objOooO0o3).booleanValue()) {
                }
                C30520o000000o c30520o000000o72222 = c30520o000000o2;
                str = str2;
                paperSpec = paperSpec3;
                map = map3;
                c30520o000000o = c30520o000000o72222;
                page3 = page;
                collection = collection4;
                it = it2;
                paperThemeOooOOO = paperTheme2;
                if (page3 != null) {
                }
                str5 = null;
                z = true;
                if (it.hasNext()) {
                }
                break;
            case 6:
                list2 = (List) this.f109084OooOoo0;
                Iterator it7 = (Iterator) this.f109082OooOoOO;
                String str11 = (String) this.f109080OooOoO;
                C30520o000000o c30520o000000o8 = (C30520o000000o) this.f109081OooOoO0;
                List list6 = (List) this.f109078OooOo;
                Map map8 = (Map) this.f109079OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                it3 = it7;
                str3 = str11;
                c30520o000000o4 = c30520o000000o8;
                list3 = list6;
                map5 = map8;
                c27449o00O0OoO = c30520o000000o4.f109005OooOO0O;
                this.f109079OooOo0o = map5;
                this.f109078OooOo = list3;
                this.f109081OooOoO0 = c30520o000000o4;
                this.f109080OooOoO = str3;
                this.f109082OooOoOO = it3;
                this.f109084OooOoo0 = null;
                this.f109088Oooo000 = 7;
                if (c27449o00O0OoO.OoooO0O(str3, list2, this) == enumC32485OooO00o) {
                }
                c30520o000000o3 = c30520o000000o4;
                list = list3;
                map4 = map5;
                if (!it3.hasNext()) {
                }
                return enumC32485OooO00o;
            case 7:
                Iterator it8 = (Iterator) this.f109082OooOoOO;
                str3 = (String) this.f109080OooOoO;
                c30520o000000o4 = (C30520o000000o) this.f109081OooOoO0;
                list3 = (List) this.f109078OooOo;
                map5 = (Map) this.f109079OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                it3 = it8;
                c30520o000000o3 = c30520o000000o4;
                list = list3;
                map4 = map5;
                if (!it3.hasNext()) {
                }
                return enumC32485OooO00o;
            case 8:
                C32446OooOOOo.OooO0O0(obj);
                return Boolean.valueOf(z);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
