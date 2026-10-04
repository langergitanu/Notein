package com.google.firebase.vertexai.common.util;

import android.util.Log;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32460OooOooO;
import oO0o.C33523OooO00o;
import oO0o.C33532OooO0oO;
import oO0o.InterfaceC33531OooO0o0;
import oO0o.OooOOO0;
import oO0o0O0o.C33591OooOOO;
import oO0o0O0o.C33599OooOo0O;
import oO0o0ooO.InterfaceC33911OooO0OO;
import oO0oO000.InterfaceC34004OooO0Oo;
import oO0oO000.OooO0OO;
import oOo000Oo.OooOOO;
import oOoo0.InterfaceC34595OooO0Oo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m80612d2 = {"Lcom/google/firebase/vertexai/common/util/FirstOrdinalSerializer;", "", "T", "LoO0o0ooO/OooO0OO;", "LoOoo0/OooO0Oo;", "enumClass", "<init>", "(LoOoo0/OooO0Oo;)V", "", "name", "LoO00ooO/OooOooO;", "printWarning", "(Ljava/lang/String;)V", "LoO0oO000/OooO0OO;", "decoder", "deserialize", "(LoO0oO000/OooO0OO;)Ljava/lang/Enum;", "LoO0oO000/OooO0Oo;", "encoder", "value", "serialize", "(LoO0oO000/OooO0Oo;Ljava/lang/Enum;)V", "LoOoo0/OooO0Oo;", "LoO0o/OooO0o0;", "descriptor", "LoO0o/OooO0o0;", "getDescriptor", "()LoO0o/OooO0o0;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class FirstOrdinalSerializer<T extends Enum<T>> implements InterfaceC33911OooO0OO<T> {
    private final InterfaceC33531OooO0o0 descriptor;
    private final InterfaceC34595OooO0Oo<T> enumClass;

    public FirstOrdinalSerializer(InterfaceC34595OooO0Oo<T> enumClass) {
        OooOOO0.OooO0oO(enumClass, "enumClass");
        this.enumClass = enumClass;
        InterfaceC33531OooO0o0[] interfaceC33531OooO0o0Arr = new InterfaceC33531OooO0o0[0];
        if (C33599OooOo0O.Oooo0o0("FirstOrdinalSerializer")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        C33523OooO00o c33523OooO00o = new C33523OooO00o("FirstOrdinalSerializer");
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        this.descriptor = new C33532OooO0oO("FirstOrdinalSerializer", OooOOO0.OooO00o.f121132OooO00o, c33523OooO00o.f121095OooO0OO.size(), OooOOO.OoooOO0(interfaceC33531OooO0o0Arr), c33523OooO00o);
    }

    private final void printWarning(String name) {
        Log.e("FirstOrdinalSerializer", C33591OooOOO.OooO("\n        |Unknown enum value found: " + name + "\"\n        |This usually means the backend was updated, and the SDK needs to be updated to match it.\n        |Check if there's a new version for the SDK, otherwise please open an issue on our\n        |GitHub to bring it to our attention:\n        |https://github.com/google/google-ai-android\n       "));
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public InterfaceC33531OooO0o0 getDescriptor() {
        return this.descriptor;
    }

    @Override // oO0o0ooO.InterfaceC33910OooO0O0
    public T deserialize(OooO0OO decoder) {
        T t;
        kotlin.jvm.internal.OooOOO0.OooO0oO(decoder, "decoder");
        String strOooOO0 = decoder.OooOO0();
        Enum[] enumArrEnumValues = SerializationKt.enumValues(this.enumClass);
        int length = enumArrEnumValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                t = null;
                break;
            }
            t = (T) enumArrEnumValues[i];
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(SerializationKt.getSerialName(t), strOooOO0)) {
                break;
            }
            i++;
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) OooOOO.OooOoo0(enumArrEnumValues);
        printWarning(strOooOO0);
        return t2;
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO
    public void serialize(InterfaceC34004OooO0Oo encoder, T value) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(encoder, "encoder");
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        encoder.OooOOoo(SerializationKt.getSerialName(value));
    }
}
