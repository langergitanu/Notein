package o0OOo0o;

import android.net.Uri;
import com.huawei.hms.network.embedded.C18358t1;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O00oo.C32520OooO0oo;
import oO0o0O0o.C33596OooOOo0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34428OooOOo;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* JADX INFO: renamed from: o0OOo0o.o00o0OOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.domain.usecase.StickerUseCase$getSvgAspectRatio$2", m80623f = "StickerUseCase.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class C27530o00o0OOO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Float>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Uri f96501OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C27538o00o0o0O f96502OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27530o00o0OOO(C27538o00o0o0O c27538o00o0o0O, Uri uri, Continuation<? super C27530o00o0OOO> continuation) {
        super(2, continuation);
        this.f96502OooOo0o = c27538o00o0o0O;
        this.f96501OooOo = uri;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C27530o00o0OOO(this.f96502OooOo0o, this.f96501OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Float> continuation) {
        return ((C27530o00o0OOO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Float f;
        Object next;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        float fFloatValue = 1.0f;
        try {
            InputStream inputStreamOpenInputStream = this.f96502OooOo0o.f96554OooO0o.getContentResolver().openInputStream(this.f96501OooOo);
            if (inputStreamOpenInputStream != null) {
                try {
                    NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(inputStreamOpenInputStream)).getElementsByTagName(C18358t1.g.f56183c);
                    kotlin.jvm.internal.OooOOO0.OooO0o(elementsByTagName, "getElementsByTagName(...)");
                    oO0O00oo.OooO OooO2 = oO0O00oo.OooOO0.OooO(0, elementsByTagName.getLength());
                    ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(OooO2, 10));
                    Iterator<Integer> it = OooO2.iterator();
                    while (((C32520OooO0oo) it).f116817OooOoO0) {
                        Node nodeItem = elementsByTagName.item(((oOo000Oo.Oooo000) it).nextInt());
                        kotlin.jvm.internal.OooOOO0.OooO0o0(nodeItem, "null cannot be cast to non-null type org.w3c.dom.Element");
                        arrayList.add((Element) nodeItem);
                    }
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        f = null;
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        if (((Element) next).hasAttribute("viewBox")) {
                            break;
                        }
                    }
                    Element element = (Element) next;
                    String attribute = element != null ? element.getAttribute("viewBox") : null;
                    if (attribute != null && attribute.length() != 0) {
                        List<String> listOoooOO0 = C33599OooOo0O.OoooOO0(attribute, new String[]{" "});
                        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(listOoooOO0, 10));
                        for (String str : listOoooOO0) {
                            kotlin.jvm.internal.OooOOO0.OooO0oO(str, "<this>");
                            Float fValueOf = C33596OooOOo0.OooOO0(str) ? Float.valueOf(Float.parseFloat(str)) : null;
                            arrayList2.add(fValueOf);
                        }
                        Float f2 = (Float) arrayList2.get(2);
                        float fFloatValue2 = f2 != null ? f2.floatValue() : 1.0f;
                        Float f3 = (Float) arrayList2.get(3);
                        float fFloatValue3 = f3 != null ? f3.floatValue() : 1.0f;
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("StickerUseCase");
                        float f4 = fFloatValue2 / fFloatValue3;
                        c20358OooO00o.OooO0o0("viewBox: " + attribute + ", width: " + fFloatValue2 + ", height: " + fFloatValue3 + ", aspectRatio: " + f4, new Object[0]);
                        f = new Float(f4);
                    }
                    inputStreamOpenInputStream.close();
                    if (f != null) {
                        fFloatValue = f.floatValue();
                    }
                } finally {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("StickerUseCase");
            c20358OooO00o2.OooO0Oo(e, "getSvgAspectRatio error.", new Object[0]);
        }
        return new Float(fFloatValue);
    }
}
