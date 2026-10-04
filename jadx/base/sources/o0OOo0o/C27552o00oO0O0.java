package o0OOo0o;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.page.Page;
import com.orion.notein.domain.models.page.PageGrid;
import com.orion.notein.domain.models.page.PageLayer;
import com.orion.notein.domain.models.page.TextBox;
import com.orion.notein.domain.models.search.ISearchResult;
import com.orion.notein.domain.models.search.TextSearchResult;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import o0O0oooO.AbstractApplicationC26277OooOoOO;
import o0O0oooO.C26264OooOOO0;
import o0OOo0o.C27545o00o0oo0;
import o0OOooO.C27881OooOO0O;
import o0oo000O.C31190OooO0oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0OOo0o.o00oO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.TextRecognitionAndSearchUseCase$searchTextInPages$searchResultFlow$1", m80623f = "TextRecognitionAndSearchUseCase.kt", m80624l = {484, 487, 493, 497, 517, 525, 531, 554, 557}, m80625m = "invokeSuspend")
public final class C27552o00oO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33723OooO0oO<? super List<? extends TextSearchResult>>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f96633OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Collection f96634OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Object f96635OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f96636OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Object f96637OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public Object f96638OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Object f96639OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public Iterator f96640OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public C27545o00o0oo0.OooO00o f96641OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final /* synthetic */ C27545o00o0oo0 f96642Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f96643Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f96644Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public /* synthetic */ Object f96645Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final /* synthetic */ Note f96646Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final /* synthetic */ List<C27545o00o0oo0.OooO00o> f96647Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final /* synthetic */ String f96648Oooo0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27552o00oO0O0(C27545o00o0oo0 c27545o00o0oo0, Note note, List<C27545o00o0oo0.OooO00o> list, String str, Continuation<? super C27552o00oO0O0> continuation) {
        super(2, continuation);
        this.f96642Oooo0 = c27545o00o0oo0;
        this.f96646Oooo0O0 = note;
        this.f96647Oooo0OO = list;
        this.f96648Oooo0o0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C27552o00oO0O0 c27552o00oO0O0 = new C27552o00oO0O0(this.f96642Oooo0, this.f96646Oooo0O0, this.f96647Oooo0OO, this.f96648Oooo0o0, continuation);
        c27552o00oO0O0.f96645Oooo00o = obj;
        return c27552o00oO0O0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33723OooO0oO<? super List<? extends TextSearchResult>> interfaceC33723OooO0oO, Continuation<? super C32460OooOooO> continuation) {
        return ((C27552o00oO0O0) create(interfaceC33723OooO0oO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:91|92|128|93|129|94|95|105|(2:106|(2:133|112)(2:108|(1:134)(1:111)))|110|(1:114)|115|(2:118|116)|135|119|(4:122|8|82|(1:123)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x04d3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x04d4, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x058f, code lost:
    
        if (r1.emit(r13, r42) == r7) goto L125;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x053d A[LOOP:1: B:116:0x0537->B:118:0x053d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x051e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01e2 A[LOOP:6: B:28:0x01dc->B:30:0x01e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x047a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x056f -> B:8:0x003d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x039b -> B:77:0x03a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x03ab -> B:78:0x03a9). Please report as a decompilation issue!!! */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC33723OooO0oO interfaceC33723OooO0oO;
        List arrayList;
        Object objOooOO0;
        Set set;
        List list;
        Iterator it;
        Object objOooO00o;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO2;
        Set set2;
        List list2;
        Set set3;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO3;
        Iterator it2;
        String str;
        Note note;
        Set set4;
        List list3;
        boolean z;
        C27545o00o0oo0 c27545o00o0oo0;
        C27545o00o0oo0.OooO00o oooO00o;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO4;
        C27545o00o0oo0 c27545o00o0oo02;
        String str2;
        Note note2;
        Object objOooO0o0;
        List list4;
        List list5;
        Set set5;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO5;
        Note note3;
        String str3;
        C27545o00o0oo0.OooO00o oooO00o2;
        Iterator it3;
        Object objOooO0Oo;
        TextSearchResult textSearchResult;
        TextSearchResult textSearchResultCopy$default;
        String str4;
        List<RectF> textRectList;
        String str5;
        C27545o00o0oo0 c27545o00o0oo03;
        Note note4;
        Set set6;
        List list6;
        Iterator it4;
        String str6;
        Iterator it5;
        Note note5;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO6;
        PageGrid pageGrid;
        TextSearchResult textSearchResult2;
        Note note6;
        Object objOooO0o;
        Page page;
        Page page2;
        TextSearchResult textSearchResult3;
        Note note7;
        InterfaceC33723OooO0oO interfaceC33723OooO0oO7;
        Object objCreateTnBitmapByPage;
        Iterator it6;
        int i;
        ArrayList arrayList2;
        Iterator it7;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = this.f96644Oooo00O;
        C27545o00o0oo0 c27545o00o0oo04 = this.f96642Oooo0;
        String str7 = "null cannot be cast to non-null type com.orion.notein.domain.models.search.TextSearchResult";
        Note note8 = this.f96646Oooo0O0;
        switch (i2) {
            case 0:
                C32446OooOOOo.OooO0O0(obj);
                interfaceC33723OooO0oO = (InterfaceC33723OooO0oO) this.f96645Oooo00o;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                arrayList = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                C27881OooOO0O c27881OooOO0O = c27545o00o0oo04.f96578OooO0OO;
                String id = note8.getId();
                this.f96645Oooo00o = interfaceC33723OooO0oO;
                this.f96634OooOo0o = linkedHashSet;
                this.f96633OooOo = arrayList;
                this.f96636OooOoO0 = arrayList3;
                this.f96644Oooo00O = 1;
                objOooOO0 = c27881OooOO0O.f98543OooO00o.OooOO0(id, this);
                if (objOooOO0 != enumC32485OooO00o) {
                    set = linkedHashSet;
                    list = arrayList3;
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : (Iterable) objOooOO0) {
                        if (((PageLayer) obj2).getVisible()) {
                            arrayList4.add(obj2);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList(C34428OooOOo.OooOOoo(arrayList4, 10));
                    it = arrayList4.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(((PageLayer) it.next()).getId());
                    }
                    Set setO0OO00O = oOo000Oo.OooOo.o0OO00O(arrayList5);
                    this.f96645Oooo00o = interfaceC33723OooO0oO;
                    this.f96634OooOo0o = set;
                    this.f96633OooOo = arrayList;
                    this.f96636OooOoO0 = list;
                    this.f96635OooOoO = setO0OO00O;
                    this.f96644Oooo00O = 2;
                    objOooO00o = C27545o00o0oo0.OooO00o(c27545o00o0oo04, this);
                    if (objOooO00o != enumC32485OooO00o) {
                        interfaceC33723OooO0oO2 = interfaceC33723OooO0oO;
                        set2 = setO0OO00O;
                        boolean zBooleanValue = ((Boolean) objOooO00o).booleanValue();
                        list2 = arrayList;
                        set3 = set;
                        interfaceC33723OooO0oO3 = interfaceC33723OooO0oO2;
                        it2 = this.f96647Oooo0OO.iterator();
                        str = this.f96648Oooo0o0;
                        note = note8;
                        set4 = set2;
                        list3 = list;
                        z = zBooleanValue;
                        c27545o00o0oo0 = c27545o00o0oo04;
                        if (!it2.hasNext()) {
                            oooO00o = (C27545o00o0oo0.OooO00o) it2.next();
                            c27545o00o0oo02 = c27545o00o0oo04;
                            Page page3 = oooO00o.f96586OooO00o;
                            C26264OooOOO0 c26264OooOOO0 = c27545o00o0oo0.f96582OooO0oO;
                            note2 = note8;
                            String id2 = page3.getId();
                            Set set7 = set3;
                            String id3 = note.getId();
                            str2 = str7;
                            RectF bounds = oooO00o.f96588OooO0OO.getBounds();
                            this.f96645Oooo00o = interfaceC33723OooO0oO3;
                            InterfaceC33723OooO0oO interfaceC33723OooO0oO8 = interfaceC33723OooO0oO3;
                            this.f96634OooOo0o = set7;
                            this.f96633OooOo = list2;
                            this.f96636OooOoO0 = list3;
                            this.f96635OooOoO = set4;
                            this.f96637OooOoOO = c27545o00o0oo0;
                            this.f96639OooOoo0 = note;
                            this.f96638OooOoo = str;
                            this.f96640OooOooO = it2;
                            this.f96641OooOooo = oooO00o;
                            this.f96643Oooo000 = z;
                            this.f96644Oooo00O = 3;
                            objOooO0o0 = c26264OooOOO0.OooO0o0(id2, id3, bounds, this);
                            if (objOooO0o0 != enumC32485OooO00o) {
                                set3 = set7;
                                interfaceC33723OooO0oO4 = interfaceC33723OooO0oO8;
                                Set set8 = set4;
                                note3 = note;
                                boolean z2 = z;
                                C27545o00o0oo0 c27545o00o0oo05 = c27545o00o0oo0;
                                Iterator it8 = it2;
                                ArrayList arrayList6 = new ArrayList();
                                it4 = ((Iterable) objOooO0o0).iterator();
                                while (it4.hasNext()) {
                                    Object next = it4.next();
                                    Iterator it9 = it4;
                                    if (set8.contains(((TextBox) next).getLayerId())) {
                                        arrayList6.add(next);
                                    }
                                    it4 = it9;
                                }
                                this.f96645Oooo00o = interfaceC33723OooO0oO4;
                                this.f96634OooOo0o = set3;
                                this.f96633OooOo = list2;
                                this.f96636OooOoO0 = list3;
                                this.f96635OooOoO = set8;
                                this.f96637OooOoOO = c27545o00o0oo05;
                                this.f96639OooOoo0 = note3;
                                this.f96638OooOoo = str;
                                this.f96640OooOooO = it8;
                                this.f96641OooOooo = oooO00o;
                                this.f96643Oooo000 = z2;
                                this.f96644Oooo00O = 4;
                                objOooO0Oo = C27545o00o0oo0.OooO0Oo(c27545o00o0oo05, oooO00o, arrayList6, str, z2, this);
                                if (objOooO0Oo != enumC32485OooO00o) {
                                    c27545o00o0oo0 = c27545o00o0oo05;
                                    z = z2;
                                    str3 = str;
                                    oooO00o2 = oooO00o;
                                    it3 = it8;
                                    list5 = list3;
                                    interfaceC33723OooO0oO5 = interfaceC33723OooO0oO4;
                                    list4 = list2;
                                    set5 = set8;
                                    textSearchResult = (TextSearchResult) objOooO0Oo;
                                    if (textSearchResult == null) {
                                        List<RectF> textRectList2 = textSearchResult.getTextRectList();
                                        ArrayList arrayList7 = new ArrayList();
                                        Iterator it10 = textRectList2.iterator();
                                        while (it10.hasNext()) {
                                            Object next2 = it10.next();
                                            Iterator it11 = it10;
                                            if (!set3.contains((RectF) next2)) {
                                                arrayList7.add(next2);
                                            }
                                            it10 = it11;
                                        }
                                        textSearchResultCopy$default = TextSearchResult.copy$default(textSearchResult, null, null, null, null, null, 0, arrayList7, 63, null);
                                    } else {
                                        textSearchResultCopy$default = null;
                                    }
                                    if (textSearchResultCopy$default == null && (textRectList = textSearchResultCopy$default.getTextRectList()) != null && (!textRectList.isEmpty())) {
                                        set3.addAll(textSearchResultCopy$default.getTextRectList());
                                        list4.add(textSearchResultCopy$default);
                                        list5.add(new C32443OooOOO(oooO00o2, textSearchResultCopy$default));
                                        List list7 = list4;
                                        ArrayList arrayList8 = new ArrayList(C34428OooOOo.OooOOoo(list7, 10));
                                        Iterator it12 = list7.iterator();
                                        while (it12.hasNext()) {
                                            ISearchResult iSearchResultDeepCopy = ((TextSearchResult) it12.next()).deepCopy();
                                            kotlin.jvm.internal.OooOOO0.OooO0o0(iSearchResultDeepCopy, str2);
                                            arrayList8.add((TextSearchResult) iSearchResultDeepCopy);
                                        }
                                        str4 = str2;
                                        this.f96645Oooo00o = interfaceC33723OooO0oO5;
                                        this.f96634OooOo0o = set3;
                                        this.f96633OooOo = list4;
                                        this.f96636OooOoO0 = list5;
                                        this.f96635OooOoO = set5;
                                        this.f96637OooOoOO = c27545o00o0oo0;
                                        this.f96639OooOoo0 = note3;
                                        this.f96638OooOoo = str3;
                                        this.f96640OooOooO = it3;
                                        this.f96641OooOooo = null;
                                        this.f96643Oooo000 = z;
                                        this.f96644Oooo00O = 5;
                                        if (interfaceC33723OooO0oO5.emit(arrayList8, this) != enumC32485OooO00o) {
                                            str5 = str3;
                                            c27545o00o0oo03 = c27545o00o0oo0;
                                            note4 = note3;
                                            set6 = set3;
                                            list6 = list5;
                                            List list8 = list6;
                                            set3 = set6;
                                            set4 = set5;
                                            list2 = list4;
                                            interfaceC33723OooO0oO3 = interfaceC33723OooO0oO5;
                                            list3 = list8;
                                            c27545o00o0oo0 = c27545o00o0oo03;
                                            note = note4;
                                            str = str5;
                                            it2 = it3;
                                            str7 = str4;
                                            c27545o00o0oo04 = c27545o00o0oo02;
                                            note8 = note2;
                                            if (!it2.hasNext()) {
                                            }
                                        }
                                    } else {
                                        str4 = str2;
                                        str = str3;
                                        note = note3;
                                        set4 = set5;
                                        list2 = list4;
                                        interfaceC33723OooO0oO3 = interfaceC33723OooO0oO5;
                                        list3 = list5;
                                        it2 = it3;
                                        str7 = str4;
                                        c27545o00o0oo04 = c27545o00o0oo02;
                                        note8 = note2;
                                        if (!it2.hasNext()) {
                                            Note note9 = note8;
                                            str6 = str7;
                                            it5 = list3.iterator();
                                            note5 = note9;
                                            interfaceC33723OooO0oO6 = interfaceC33723OooO0oO3;
                                            if (it5.hasNext()) {
                                                C32443OooOOO c32443OooOOO = (C32443OooOOO) it5.next();
                                                C27545o00o0oo0.OooO00o oooO00o3 = (C27545o00o0oo0.OooO00o) c32443OooOOO.f116638OooOo0o;
                                                textSearchResult2 = (TextSearchResult) c32443OooOOO.f116637OooOo;
                                                Page page4 = oooO00o3.f96586OooO00o;
                                                C27585o00ooO0 c27585o00ooO0 = c27545o00o0oo04.f96581OooO0o0;
                                                String id4 = page4.getId();
                                                String id5 = note5.getId();
                                                this.f96645Oooo00o = interfaceC33723OooO0oO6;
                                                this.f96634OooOo0o = list2;
                                                this.f96633OooOo = c27545o00o0oo04;
                                                this.f96636OooOoO0 = note5;
                                                this.f96635OooOoO = it5;
                                                this.f96637OooOoOO = textSearchResult2;
                                                this.f96639OooOoo0 = page4;
                                                PageGrid pageGrid2 = oooO00o3.f96588OooO0OO;
                                                this.f96638OooOoo = pageGrid2;
                                                this.f96640OooOooO = null;
                                                this.f96641OooOooo = null;
                                                this.f96644Oooo00O = 6;
                                                objOooO0o = c27585o00ooO0.OooO0o(id4, id5, null, this);
                                                if (objOooO0o != enumC32485OooO00o) {
                                                    note6 = note5;
                                                    pageGrid = pageGrid2;
                                                    page = page4;
                                                    Page page5 = page;
                                                    TextSearchResult textSearchResult4 = textSearchResult2;
                                                    TextSearchResult textSearchResultCopy$default2 = TextSearchResult.copy$default(textSearchResult4, null, null, null, null, Page.copy$default(page, null, null, null, null, null, null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, (List) objOooO0o, null, 393215, null), 0, null, 111, null);
                                                    AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO = c27545o00o0oo04.f96576OooO00o;
                                                    this.f96645Oooo00o = interfaceC33723OooO0oO6;
                                                    this.f96634OooOo0o = list2;
                                                    this.f96633OooOo = c27545o00o0oo04;
                                                    this.f96636OooOoO0 = note6;
                                                    this.f96635OooOoO = it5;
                                                    this.f96637OooOoOO = textSearchResult4;
                                                    this.f96639OooOoo0 = page5;
                                                    this.f96638OooOoo = pageGrid;
                                                    this.f96644Oooo00O = 7;
                                                    objCreateTnBitmapByPage = textSearchResultCopy$default2.createTnBitmapByPage(abstractApplicationC26277OooOoOO, this);
                                                    if (objCreateTnBitmapByPage != enumC32485OooO00o) {
                                                        try {
                                                            Note note10 = note6;
                                                            interfaceC33723OooO0oO7 = interfaceC33723OooO0oO6;
                                                            page2 = page5;
                                                            note7 = note10;
                                                            textSearchResult3 = textSearchResult4;
                                                            Bitmap bitmap = (Bitmap) objCreateTnBitmapByPage;
                                                            int i3 = C27545o00o0oo0.f96574OooOO0o;
                                                            c27545o00o0oo04.getClass();
                                                            File file = new File(c27545o00o0oo04.f96576OooO00o.getExternalFilesDir(null), "search-snapshot");
                                                            C31190OooO0oo.OooO0o(file);
                                                            File file2 = new File(file, page2.getId() + C18115b5.CONNECTOR + pageGrid.getIndex());
                                                            bitmap.compress(Bitmap.CompressFormat.JPEG, 75, fileOutputStream);
                                                            fileOutputStream.close();
                                                            String absolutePath = file2.getAbsolutePath();
                                                            kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath, "getAbsolutePath(...)");
                                                            TextSearchResult textSearchResultCopy$default3 = TextSearchResult.copy$default(textSearchResult3, null, null, absolutePath, null, null, 0, null, 123, null);
                                                            it6 = list2.iterator();
                                                            i = 0;
                                                            while (true) {
                                                                if (!it6.hasNext()) {
                                                                    i = -1;
                                                                } else if (!kotlin.jvm.internal.OooOOO0.OooO0O0(((TextSearchResult) it6.next()).getId(), textSearchResultCopy$default3.getId())) {
                                                                    i++;
                                                                }
                                                            }
                                                            if (i != -1) {
                                                                list2.set(i, textSearchResultCopy$default3);
                                                            }
                                                            List list9 = list2;
                                                            arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list9, 10));
                                                            it7 = list9.iterator();
                                                            while (it7.hasNext()) {
                                                                ISearchResult iSearchResultDeepCopy2 = ((TextSearchResult) it7.next()).deepCopy();
                                                                kotlin.jvm.internal.OooOOO0.OooO0o0(iSearchResultDeepCopy2, str6);
                                                                arrayList2.add((TextSearchResult) iSearchResultDeepCopy2);
                                                            }
                                                            this.f96645Oooo00o = interfaceC33723OooO0oO7;
                                                            this.f96634OooOo0o = list2;
                                                            this.f96633OooOo = c27545o00o0oo04;
                                                            this.f96636OooOoO0 = note7;
                                                            this.f96635OooOoO = it5;
                                                            this.f96637OooOoOO = null;
                                                            this.f96639OooOoo0 = null;
                                                            this.f96638OooOoo = null;
                                                            this.f96644Oooo00O = 8;
                                                            if (interfaceC33723OooO0oO7.emit(arrayList2, this) != enumC32485OooO00o) {
                                                                note5 = note7;
                                                                interfaceC33723OooO0oO6 = interfaceC33723OooO0oO7;
                                                                if (it5.hasNext()) {
                                                                    this.f96645Oooo00o = null;
                                                                    this.f96634OooOo0o = null;
                                                                    this.f96633OooOo = null;
                                                                    this.f96636OooOoO0 = null;
                                                                    this.f96635OooOoO = null;
                                                                    this.f96637OooOoOO = null;
                                                                    this.f96639OooOoo0 = null;
                                                                    this.f96638OooOoo = null;
                                                                    this.f96640OooOooO = null;
                                                                    this.f96641OooOooo = null;
                                                                    this.f96644Oooo00O = 9;
                                                                    break;
                                                                }
                                                            }
                                                        } finally {
                                                        }
                                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return enumC32485OooO00o;
            case 1:
                List list10 = (List) this.f96636OooOoO0;
                List list11 = (List) this.f96633OooOo;
                Set set9 = (Set) this.f96634OooOo0o;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO9 = (InterfaceC33723OooO0oO) this.f96645Oooo00o;
                C32446OooOOOo.OooO0O0(obj);
                list = list10;
                interfaceC33723OooO0oO = interfaceC33723OooO0oO9;
                set = set9;
                arrayList = list11;
                objOooOO0 = obj;
                ArrayList arrayList42 = new ArrayList();
                while (r4.hasNext()) {
                }
                ArrayList arrayList52 = new ArrayList(C34428OooOOo.OooOOoo(arrayList42, 10));
                it = arrayList42.iterator();
                while (it.hasNext()) {
                }
                Set setO0OO00O2 = oOo000Oo.OooOo.o0OO00O(arrayList52);
                this.f96645Oooo00o = interfaceC33723OooO0oO;
                this.f96634OooOo0o = set;
                this.f96633OooOo = arrayList;
                this.f96636OooOoO0 = list;
                this.f96635OooOoO = setO0OO00O2;
                this.f96644Oooo00O = 2;
                objOooO00o = C27545o00o0oo0.OooO00o(c27545o00o0oo04, this);
                if (objOooO00o != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 2:
                set2 = (Set) this.f96635OooOoO;
                list = (List) this.f96636OooOoO0;
                arrayList = (List) this.f96633OooOo;
                set = (Set) this.f96634OooOo0o;
                interfaceC33723OooO0oO2 = (InterfaceC33723OooO0oO) this.f96645Oooo00o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO00o = obj;
                boolean zBooleanValue2 = ((Boolean) objOooO00o).booleanValue();
                list2 = arrayList;
                set3 = set;
                interfaceC33723OooO0oO3 = interfaceC33723OooO0oO2;
                it2 = this.f96647Oooo0OO.iterator();
                str = this.f96648Oooo0o0;
                note = note8;
                set4 = set2;
                list3 = list;
                z = zBooleanValue2;
                c27545o00o0oo0 = c27545o00o0oo04;
                if (!it2.hasNext()) {
                }
                break;
            case 3:
                z = this.f96643Oooo000;
                oooO00o = this.f96641OooOooo;
                it2 = this.f96640OooOooO;
                str = (String) this.f96638OooOoo;
                note = (Note) this.f96639OooOoo0;
                c27545o00o0oo0 = (C27545o00o0oo0) this.f96637OooOoOO;
                set4 = (Set) this.f96635OooOoO;
                list3 = (List) this.f96636OooOoO0;
                list2 = (List) this.f96633OooOo;
                set3 = (Set) this.f96634OooOo0o;
                interfaceC33723OooO0oO4 = (InterfaceC33723OooO0oO) this.f96645Oooo00o;
                C32446OooOOOo.OooO0O0(obj);
                c27545o00o0oo02 = c27545o00o0oo04;
                str2 = "null cannot be cast to non-null type com.orion.notein.domain.models.search.TextSearchResult";
                note2 = note8;
                objOooO0o0 = obj;
                Set set82 = set4;
                note3 = note;
                boolean z22 = z;
                C27545o00o0oo0 c27545o00o0oo052 = c27545o00o0oo0;
                Iterator it82 = it2;
                ArrayList arrayList62 = new ArrayList();
                it4 = ((Iterable) objOooO0o0).iterator();
                while (it4.hasNext()) {
                }
                this.f96645Oooo00o = interfaceC33723OooO0oO4;
                this.f96634OooOo0o = set3;
                this.f96633OooOo = list2;
                this.f96636OooOoO0 = list3;
                this.f96635OooOoO = set82;
                this.f96637OooOoOO = c27545o00o0oo052;
                this.f96639OooOoo0 = note3;
                this.f96638OooOoo = str;
                this.f96640OooOooO = it82;
                this.f96641OooOooo = oooO00o;
                this.f96643Oooo000 = z22;
                this.f96644Oooo00O = 4;
                objOooO0Oo = C27545o00o0oo0.OooO0Oo(c27545o00o0oo052, oooO00o, arrayList62, str, z22, this);
                if (objOooO0Oo != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 4:
                z = this.f96643Oooo000;
                C27545o00o0oo0.OooO00o oooO00o4 = this.f96641OooOooo;
                Iterator it13 = this.f96640OooOooO;
                String str8 = (String) this.f96638OooOoo;
                Note note11 = (Note) this.f96639OooOoo0;
                C27545o00o0oo0 c27545o00o0oo06 = (C27545o00o0oo0) this.f96637OooOoOO;
                Set set10 = (Set) this.f96635OooOoO;
                List list12 = (List) this.f96636OooOoO0;
                List list13 = (List) this.f96633OooOo;
                Set set11 = (Set) this.f96634OooOo0o;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO10 = (InterfaceC33723OooO0oO) this.f96645Oooo00o;
                C32446OooOOOo.OooO0O0(obj);
                list4 = list13;
                set3 = set11;
                c27545o00o0oo02 = c27545o00o0oo04;
                str2 = "null cannot be cast to non-null type com.orion.notein.domain.models.search.TextSearchResult";
                note2 = note8;
                list5 = list12;
                set5 = set10;
                interfaceC33723OooO0oO5 = interfaceC33723OooO0oO10;
                c27545o00o0oo0 = c27545o00o0oo06;
                note3 = note11;
                str3 = str8;
                oooO00o2 = oooO00o4;
                it3 = it13;
                objOooO0Oo = obj;
                textSearchResult = (TextSearchResult) objOooO0Oo;
                if (textSearchResult == null) {
                }
                if (textSearchResultCopy$default == null) {
                }
                str4 = str2;
                str = str3;
                note = note3;
                set4 = set5;
                list2 = list4;
                interfaceC33723OooO0oO3 = interfaceC33723OooO0oO5;
                list3 = list5;
                it2 = it3;
                str7 = str4;
                c27545o00o0oo04 = c27545o00o0oo02;
                note8 = note2;
                if (!it2.hasNext()) {
                }
                break;
            case 5:
                z = this.f96643Oooo000;
                it3 = this.f96640OooOooO;
                str5 = (String) this.f96638OooOoo;
                note4 = (Note) this.f96639OooOoo0;
                c27545o00o0oo03 = (C27545o00o0oo0) this.f96637OooOoOO;
                set5 = (Set) this.f96635OooOoO;
                list6 = (List) this.f96636OooOoO0;
                list4 = (List) this.f96633OooOo;
                set6 = (Set) this.f96634OooOo0o;
                interfaceC33723OooO0oO5 = (InterfaceC33723OooO0oO) this.f96645Oooo00o;
                C32446OooOOOo.OooO0O0(obj);
                c27545o00o0oo02 = c27545o00o0oo04;
                note2 = note8;
                str4 = "null cannot be cast to non-null type com.orion.notein.domain.models.search.TextSearchResult";
                List list82 = list6;
                set3 = set6;
                set4 = set5;
                list2 = list4;
                interfaceC33723OooO0oO3 = interfaceC33723OooO0oO5;
                list3 = list82;
                c27545o00o0oo0 = c27545o00o0oo03;
                note = note4;
                str = str5;
                it2 = it3;
                str7 = str4;
                c27545o00o0oo04 = c27545o00o0oo02;
                note8 = note2;
                if (!it2.hasNext()) {
                }
                break;
            case 6:
                pageGrid = (PageGrid) this.f96638OooOoo;
                Page page6 = (Page) this.f96639OooOoo0;
                textSearchResult2 = (TextSearchResult) this.f96637OooOoOO;
                it5 = (Iterator) this.f96635OooOoO;
                note6 = (Note) this.f96636OooOoO0;
                c27545o00o0oo04 = (C27545o00o0oo0) this.f96633OooOo;
                List list14 = (List) this.f96634OooOo0o;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO11 = (InterfaceC33723OooO0oO) this.f96645Oooo00o;
                C32446OooOOOo.OooO0O0(obj);
                objOooO0o = obj;
                page = page6;
                interfaceC33723OooO0oO6 = interfaceC33723OooO0oO11;
                list2 = list14;
                str6 = "null cannot be cast to non-null type com.orion.notein.domain.models.search.TextSearchResult";
                Page page52 = page;
                TextSearchResult textSearchResult42 = textSearchResult2;
                TextSearchResult textSearchResultCopy$default22 = TextSearchResult.copy$default(textSearchResult42, null, null, null, null, Page.copy$default(page, null, null, null, null, null, null, null, null, false, 0, 0L, 0L, null, null, 0, false, null, (List) objOooO0o, null, 393215, null), 0, null, 111, null);
                AbstractApplicationC26277OooOoOO abstractApplicationC26277OooOoOO2 = c27545o00o0oo04.f96576OooO00o;
                this.f96645Oooo00o = interfaceC33723OooO0oO6;
                this.f96634OooOo0o = list2;
                this.f96633OooOo = c27545o00o0oo04;
                this.f96636OooOoO0 = note6;
                this.f96635OooOoO = it5;
                this.f96637OooOoOO = textSearchResult42;
                this.f96639OooOoo0 = page52;
                this.f96638OooOoo = pageGrid;
                this.f96644Oooo00O = 7;
                objCreateTnBitmapByPage = textSearchResultCopy$default22.createTnBitmapByPage(abstractApplicationC26277OooOoOO2, this);
                if (objCreateTnBitmapByPage != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 7:
                pageGrid = (PageGrid) this.f96638OooOoo;
                page2 = (Page) this.f96639OooOoo0;
                TextSearchResult textSearchResult5 = (TextSearchResult) this.f96637OooOoOO;
                it5 = (Iterator) this.f96635OooOoO;
                Note note12 = (Note) this.f96636OooOoO0;
                c27545o00o0oo04 = (C27545o00o0oo0) this.f96633OooOo;
                List list15 = (List) this.f96634OooOo0o;
                InterfaceC33723OooO0oO interfaceC33723OooO0oO12 = (InterfaceC33723OooO0oO) this.f96645Oooo00o;
                C32446OooOOOo.OooO0O0(obj);
                textSearchResult3 = textSearchResult5;
                note7 = note12;
                interfaceC33723OooO0oO7 = interfaceC33723OooO0oO12;
                objCreateTnBitmapByPage = obj;
                list2 = list15;
                str6 = "null cannot be cast to non-null type com.orion.notein.domain.models.search.TextSearchResult";
                Bitmap bitmap2 = (Bitmap) objCreateTnBitmapByPage;
                int i32 = C27545o00o0oo0.f96574OooOO0o;
                c27545o00o0oo04.getClass();
                File file3 = new File(c27545o00o0oo04.f96576OooO00o.getExternalFilesDir(null), "search-snapshot");
                C31190OooO0oo.OooO0o(file3);
                File file22 = new File(file3, page2.getId() + C18115b5.CONNECTOR + pageGrid.getIndex());
                FileOutputStream fileOutputStream2 = new FileOutputStream(file22);
                bitmap2.compress(Bitmap.CompressFormat.JPEG, 75, fileOutputStream2);
                fileOutputStream2.close();
                String absolutePath2 = file22.getAbsolutePath();
                kotlin.jvm.internal.OooOOO0.OooO0o(absolutePath2, "getAbsolutePath(...)");
                TextSearchResult textSearchResultCopy$default32 = TextSearchResult.copy$default(textSearchResult3, null, null, absolutePath2, null, null, 0, null, 123, null);
                it6 = list2.iterator();
                i = 0;
                while (true) {
                    if (!it6.hasNext()) {
                    }
                    i++;
                }
                if (i != -1) {
                }
                List list92 = list2;
                arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(list92, 10));
                it7 = list92.iterator();
                while (it7.hasNext()) {
                }
                this.f96645Oooo00o = interfaceC33723OooO0oO7;
                this.f96634OooOo0o = list2;
                this.f96633OooOo = c27545o00o0oo04;
                this.f96636OooOoO0 = note7;
                this.f96635OooOoO = it5;
                this.f96637OooOoOO = null;
                this.f96639OooOoo0 = null;
                this.f96638OooOoo = null;
                this.f96644Oooo00O = 8;
                if (interfaceC33723OooO0oO7.emit(arrayList2, this) != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            case 8:
                Iterator it14 = (Iterator) this.f96635OooOoO;
                Note note13 = (Note) this.f96636OooOoO0;
                C27545o00o0oo0 c27545o00o0oo07 = (C27545o00o0oo0) this.f96633OooOo;
                List list16 = (List) this.f96634OooOo0o;
                interfaceC33723OooO0oO7 = (InterfaceC33723OooO0oO) this.f96645Oooo00o;
                C32446OooOOOo.OooO0O0(obj);
                c27545o00o0oo04 = c27545o00o0oo07;
                list2 = list16;
                str6 = "null cannot be cast to non-null type com.orion.notein.domain.models.search.TextSearchResult";
                it5 = it14;
                note5 = note13;
                interfaceC33723OooO0oO6 = interfaceC33723OooO0oO7;
                if (it5.hasNext()) {
                }
                return enumC32485OooO00o;
            case 9:
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
