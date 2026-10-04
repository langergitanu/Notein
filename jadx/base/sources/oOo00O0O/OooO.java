package oOo00O0O;

import Ooooo00.C21246OooO0OO;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32442OooOO0o;
import oO0o.AbstractC33525OooO0OO;
import oO0o.InterfaceC33531OooO0o0;
import oO0o0ooO.C33917OooOO0;
import oO0o0ooO.InterfaceC33910OooO0O0;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;
import oOoo0.InterfaceC34595OooO0Oo;
import ooOOoOO0.C35133OooOoOO;
import ooOOoOO0.C35135OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010\u0017\u001a\u00020\u0016H$¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, m80612d2 = {"LoOo00O0O/OooO;", "", "T", "LoO0o0ooO/OooO0OO;", "LoOoo0/OooO0Oo;", "baseClass", "<init>", "(LoOoo0/OooO0Oo;)V", "subClass", "", "throwSubtypeNotRegistered", "(LoOoo0/OooO0Oo;LoOoo0/OooO0Oo;)Ljava/lang/Void;", "LoO0oO000/OooO0Oo;", "encoder", "value", "LoO00ooO/OooOooO;", "serialize", "(LoO0oO000/OooO0Oo;Ljava/lang/Object;)V", "LoO0oO000/OooO0OO;", "decoder", "deserialize", "(LoO0oO000/OooO0OO;)Ljava/lang/Object;", "LoOo00O0O/OooOO0O;", "element", "LoO0o0ooO/OooO0O0;", "selectDeserializer", "(LoOo00O0O/OooOO0O;)LoO0o0ooO/OooO0O0;", "LoOoo0/OooO0Oo;", "LoO0o/OooO0o0;", "descriptor", "LoO0o/OooO0o0;", "getDescriptor", "()LoO0o/OooO0o0;", "kotlinx-serialization-json"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public abstract class OooO<T> implements InterfaceC33911OooO0OO<T> {
    private final InterfaceC34595OooO0Oo<T> baseClass;
    private final InterfaceC33531OooO0o0 descriptor;

    public OooO(InterfaceC34595OooO0Oo<T> baseClass) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(baseClass, "baseClass");
        this.baseClass = baseClass;
        this.descriptor = oO0o.OooOO0O.OooO0OO("JsonContentPolymorphicSerializer<" + baseClass.OooOO0() + '>', AbstractC33525OooO0OO.OooO0O0.f121104OooO00o, new InterfaceC33531OooO0o0[0], new oO0o.OooOO0());
    }

    private final Void throwSubtypeNotRegistered(InterfaceC34595OooO0Oo<?> subClass, InterfaceC34595OooO0Oo<?> baseClass) {
        String strOooOO0 = subClass.OooOO0();
        if (strOooOO0 == null) {
            strOooOO0 = String.valueOf(subClass);
        }
        throw new C33917OooOO0(androidx.core.database.OooO00o.OooO00o("Class '", strOooOO0, "' is not registered for polymorphic serialization ", "in the scope of '" + baseClass.OooOO0() + '\'', ".\nMark the base class as 'sealed' or register the serializer explicitly."));
    }

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public final T deserialize(oO0oO000.OooO0OO decoder) {
        oO0oO000.OooO0OO oooOo;
        kotlin.jvm.internal.OooOOO0.OooO0oO(decoder, "decoder");
        OooOO0 oooOO0OooO0OO = C21246OooO0OO.OooO0OO(decoder);
        OooOO0O element = oooOO0OooO0OO.OooOOo0();
        InterfaceC33910OooO0O0<T> interfaceC33910OooO0O0SelectDeserializer = selectDeserializer(element);
        kotlin.jvm.internal.OooOOO0.OooO0o0(interfaceC33910OooO0O0SelectDeserializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
        InterfaceC33911OooO0OO interfaceC33911OooO0OO = (InterfaceC33911OooO0OO) interfaceC33910OooO0O0SelectDeserializer;
        AbstractC34457OooO0OO abstractC34457OooO0OOOooOoo = oooOO0OooO0OO.OooOoo();
        abstractC34457OooO0OOOooOoo.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(element, "element");
        String str = null;
        if (element instanceof C34474OooOoo0) {
            oooOo = new C35133OooOoOO(abstractC34457OooO0OOOooOoo, (C34474OooOoo0) element, str, 12);
        } else if (element instanceof C34458OooO0Oo) {
            oooOo = new C35135OooOoo0(abstractC34457OooO0OOOooOoo, (C34458OooO0Oo) element);
        } else {
            if (!(element instanceof C34468OooOo0O) && !element.equals(C34471OooOoO0.INSTANCE)) {
                throw new C32442OooOO0o();
            }
            oooOo = new ooOOoOO0.OooOo(abstractC34457OooO0OOOooOoo, (AbstractC34475OooOooO) element, null);
        }
        return (T) oooOo.OooOooo(interfaceC33911OooO0OO);
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public InterfaceC33531OooO0o0 getDescriptor() {
        return this.descriptor;
    }

    public abstract InterfaceC33910OooO0O0<T> selectDeserializer(OooOO0O element);

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public final void serialize(InterfaceC34004OooO0Oo encoder, T value) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        InterfaceC33911OooO0OO interfaceC33911OooO0OOOooOo00 = encoder.OooO0OO().OooOo00(this.baseClass, value);
        if (interfaceC33911OooO0OOOooOo00 == null) {
            Class<?> cls = value.getClass();
            Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
            interfaceC33911OooO0OOOooOo00 = o000ooOO.OooOOO0.OooO0oO(oooo0.OooO0O0(cls));
            if (interfaceC33911OooO0OOOooOo00 == null) {
                throwSubtypeNotRegistered(oooo0.OooO0O0(value.getClass()), this.baseClass);
                throw new C32438OooO0oO();
            }
        }
        interfaceC33911OooO0OOOooOo00.serialize(encoder, value);
    }
}
