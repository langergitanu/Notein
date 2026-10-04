package com.orion.penkit.models;

import java.lang.Number;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B;\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JT\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\rR\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b!\u0010\rR\u0017\u0010\u0006\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\"\u0010\rR\u0017\u0010\u0007\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b#\u0010\rR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0012¨\u0006&"}, m80612d2 = {"Lcom/orion/penkit/models/TypedRect;", "", "T", "", "left", "top", "right", "bottom", "LoO00ooO/OooOOO;", "center", "<init>", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;LoO00ooO/OooOOO;)V", "component1", "()Ljava/lang/Number;", "component2", "component3", "component4", "component5", "()LoO00ooO/OooOOO;", "copy", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;LoO00ooO/OooOOO;)Lcom/orion/penkit/models/TypedRect;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Number;", "getLeft", "getTop", "getRight", "getBottom", "LoO00ooO/OooOOO;", "getCenter", "ni-penkit_release"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class TypedRect<T extends Number> {
    private final T bottom;
    private final C32443OooOOO<T, T> center;
    private final T left;
    private final T right;
    private final T top;

    /* JADX WARN: Multi-variable type inference failed */
    public TypedRect(T left, T top, T right, T bottom, C32443OooOOO<? extends T, ? extends T> center) {
        OooOOO0.OooO0oO(left, "left");
        OooOOO0.OooO0oO(top, "top");
        OooOOO0.OooO0oO(right, "right");
        OooOOO0.OooO0oO(bottom, "bottom");
        OooOOO0.OooO0oO(center, "center");
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.center = center;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TypedRect copy$default(TypedRect typedRect, Number number, Number number2, Number number3, Number number4, C32443OooOOO c32443OooOOO, int i, Object obj) {
        if ((i & 1) != 0) {
            number = typedRect.left;
        }
        if ((i & 2) != 0) {
            number2 = typedRect.top;
        }
        if ((i & 4) != 0) {
            number3 = typedRect.right;
        }
        if ((i & 8) != 0) {
            number4 = typedRect.bottom;
        }
        if ((i & 16) != 0) {
            c32443OooOOO = typedRect.center;
        }
        C32443OooOOO c32443OooOOO2 = c32443OooOOO;
        Number number5 = number3;
        return typedRect.copy(number, number2, number5, number4, c32443OooOOO2);
    }

    public final T component1() {
        return this.left;
    }

    public final T component2() {
        return this.top;
    }

    public final T component3() {
        return this.right;
    }

    public final T component4() {
        return this.bottom;
    }

    public final C32443OooOOO<T, T> component5() {
        return this.center;
    }

    public final TypedRect<T> copy(T left, T top, T right, T bottom, C32443OooOOO<? extends T, ? extends T> center) {
        OooOOO0.OooO0oO(left, "left");
        OooOOO0.OooO0oO(top, "top");
        OooOOO0.OooO0oO(right, "right");
        OooOOO0.OooO0oO(bottom, "bottom");
        OooOOO0.OooO0oO(center, "center");
        return new TypedRect<>(left, top, right, bottom, center);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TypedRect)) {
            return false;
        }
        TypedRect typedRect = (TypedRect) other;
        return OooOOO0.OooO0O0(this.left, typedRect.left) && OooOOO0.OooO0O0(this.top, typedRect.top) && OooOOO0.OooO0O0(this.right, typedRect.right) && OooOOO0.OooO0O0(this.bottom, typedRect.bottom) && OooOOO0.OooO0O0(this.center, typedRect.center);
    }

    public final T getBottom() {
        return this.bottom;
    }

    public final C32443OooOOO<T, T> getCenter() {
        return this.center;
    }

    public final T getLeft() {
        return this.left;
    }

    public final T getRight() {
        return this.right;
    }

    public final T getTop() {
        return this.top;
    }

    public int hashCode() {
        return this.center.hashCode() + ((this.bottom.hashCode() + ((this.right.hashCode() + ((this.top.hashCode() + (this.left.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "TypedRect(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", center=" + this.center + ")";
    }
}
