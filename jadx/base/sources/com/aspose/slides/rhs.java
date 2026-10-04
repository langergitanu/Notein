package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes3.dex */
final class rhs extends AbstractC0857cj<Reflection> implements IReflectionEffectiveData, InterfaceC13788lo, InterfaceC14672vc {
    public rhs(Reflection reflection) {
        super(reflection);
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        rhs rhsVar = (rhs) C7019kk.m27452k4(obj, rhs.class);
        return rhsVar != null && getBlurRadius() == rhsVar.getBlurRadius() && getDistance() == rhsVar.getDistance() && getDirection() == rhsVar.getDirection() && getSkewHorizontal() == rhsVar.getSkewHorizontal() && getSkewVertical() == rhsVar.getSkewVertical() && getScaleHorizontal() == rhsVar.getScaleHorizontal() && getScaleVertical() == rhsVar.getScaleVertical() && getRotateShadowWithShape() == rhsVar.getRotateShadowWithShape() && getRectangleAlign() == rhsVar.getRectangleAlign() && getStartPosAlpha() == rhsVar.getStartPosAlpha() && getEndPosAlpha() == rhsVar.getEndPosAlpha() && getFadeDirection() == rhsVar.getFadeDirection() && getStartReflectionOpacity() == rhsVar.getStartReflectionOpacity() && getEndReflectionOpacity() == rhsVar.getEndReflectionOpacity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IReflectionEffectiveData
    public final double getBlurRadius() {
        if (C14067j2.m66728k4(Double.valueOf(((Reflection) this.f4329k4).getBlurRadius()), Double.valueOf(Double.NaN))) {
            return 0.0d;
        }
        return ((Reflection) this.f4329k4).getBlurRadius();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IReflectionEffectiveData
    public final float getDirection() {
        if (C14067j2.m66728k4(Float.valueOf(((Reflection) this.f4329k4).getDirection()), Float.valueOf(Float.NaN))) {
            return 0.0f;
        }
        return ((Reflection) this.f4329k4).getDirection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IReflectionEffectiveData
    public final double getDistance() {
        if (C14067j2.m66728k4(Double.valueOf(((Reflection) this.f4329k4).getDistance()), Double.valueOf(Double.NaN))) {
            return 0.0d;
        }
        return ((Reflection) this.f4329k4).getDistance();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IReflectionEffectiveData
    public final float getEndPosAlpha() {
        if (C14067j2.m66728k4(Float.valueOf(((Reflection) this.f4329k4).getEndPosAlpha()), Float.valueOf(Float.NaN))) {
            return 0.0f;
        }
        return ((Reflection) this.f4329k4).getEndPosAlpha();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IReflectionEffectiveData
    public final float getEndReflectionOpacity() {
        if (C14067j2.m66728k4(Float.valueOf(((Reflection) this.f4329k4).getEndReflectionOpacity()), Float.valueOf(Float.NaN))) {
            return 0.0f;
        }
        return ((Reflection) this.f4329k4).getEndReflectionOpacity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IReflectionEffectiveData
    public final float getFadeDirection() {
        if (C14067j2.m66728k4(Float.valueOf(((Reflection) this.f4329k4).getFadeDirection()), Float.valueOf(Float.NaN))) {
            return 0.0f;
        }
        return ((Reflection) this.f4329k4).getFadeDirection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IReflectionEffectiveData
    public final byte getRectangleAlign() {
        if (((Reflection) this.f4329k4).getRectangleAlign() != -1) {
            return ((Reflection) this.f4329k4).getRectangleAlign();
        }
        return (byte) 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IReflectionEffectiveData
    public final boolean getRotateShadowWithShape() {
        return ((Reflection) this.f4329k4).getRotateShadowWithShape();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IReflectionEffectiveData
    public final double getScaleHorizontal() {
        if (C14067j2.m66728k4(Double.valueOf(((Reflection) this.f4329k4).getScaleHorizontal()), Double.valueOf(Double.NaN))) {
            return 100.0d;
        }
        return ((Reflection) this.f4329k4).getScaleHorizontal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IReflectionEffectiveData
    public final double getScaleVertical() {
        if (C14067j2.m66728k4(Double.valueOf(((Reflection) this.f4329k4).getScaleVertical()), Double.valueOf(Double.NaN))) {
            return 100.0d;
        }
        return ((Reflection) this.f4329k4).getScaleVertical();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IReflectionEffectiveData
    public final double getSkewHorizontal() {
        if (C14067j2.m66728k4(Double.valueOf(((Reflection) this.f4329k4).getSkewHorizontal()), Double.valueOf(Double.NaN))) {
            return 0.0d;
        }
        return ((Reflection) this.f4329k4).getSkewHorizontal();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IReflectionEffectiveData
    public final double getSkewVertical() {
        if (C14067j2.m66728k4(Double.valueOf(((Reflection) this.f4329k4).getSkewVertical()), Double.valueOf(Double.NaN))) {
            return 0.0d;
        }
        return ((Reflection) this.f4329k4).getSkewVertical();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IReflectionEffectiveData
    public final float getStartPosAlpha() {
        if (C14067j2.m66728k4(Float.valueOf(((Reflection) this.f4329k4).getStartPosAlpha()), Float.valueOf(Float.NaN))) {
            return 0.0f;
        }
        return ((Reflection) this.f4329k4).getStartPosAlpha();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.IReflectionEffectiveData
    public final float getStartReflectionOpacity() {
        if (C14067j2.m66728k4(Float.valueOf(((Reflection) this.f4329k4).getStartReflectionOpacity()), Float.valueOf(Float.NaN))) {
            return 0.0f;
        }
        return ((Reflection) this.f4329k4).getStartReflectionOpacity();
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final tc4 mo3873k4(tc4 tc4Var) {
        return tc4Var;
    }

    @Override // com.aspose.slides.InterfaceC13788lo
    /* JADX INFO: renamed from: k4 */
    public final String mo3874k4() {
        String strMo48540du = C14067j2.m66727k4(this).mo48540du();
        Character chValueOf = Character.valueOf(ControlChar.SPACE_CHAR);
        return C14113y2.m67407k4(strMo48540du, chValueOf, C14044b3.m66425h4(getBlurRadius()), chValueOf, C14044b3.m66425h4(getDistance()), chValueOf, C14064he.m66704h4(getDirection()));
    }
}
