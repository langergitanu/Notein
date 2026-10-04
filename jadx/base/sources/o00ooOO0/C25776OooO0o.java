package o00ooOO0;

import com.facebook.imagepipeline.nativecode.NativeJpegTranscoderFactory;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.OooOOO0;
import o00oOoOo.C25623OooO0OO;

/* JADX INFO: renamed from: o00ooOO0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25776OooO0o implements InterfaceC25775OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25775OooO0Oo f87946OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Integer f87947OooO0O0;

    public C25776OooO0o(InterfaceC25775OooO0Oo interfaceC25775OooO0Oo, Integer num) {
        this.f87946OooO00o = interfaceC25775OooO0Oo;
        this.f87947OooO0O0 = num;
    }

    public final InterfaceC25774OooO0OO OooO00o(C25623OooO0OO c25623OooO0OO, boolean z) {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Object objNewInstance = NativeJpegTranscoderFactory.class.getConstructor(cls, cls2, cls2).newInstance(2048, Boolean.FALSE, Boolean.TRUE);
            OooOOO0.OooO0o0(objNewInstance, "null cannot be cast to non-null type com.facebook.imagepipeline.transcoder.ImageTranscoderFactory");
            return ((InterfaceC25775OooO0Oo) objNewInstance).createImageTranscoder(c25623OooO0OO, z);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e2);
        } catch (IllegalArgumentException e3) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e3);
        } catch (InstantiationException e4) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e5);
        } catch (SecurityException e6) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e6);
        } catch (InvocationTargetException e7) {
            throw new RuntimeException("Dependency ':native-imagetranscoder' is needed to use the default native image transcoder.", e7);
        }
    }

    @Override // o00ooOO0.InterfaceC25775OooO0Oo
    public final InterfaceC25774OooO0OO createImageTranscoder(C25623OooO0OO imageFormat, boolean z) {
        OooOOO0.OooO0oO(imageFormat, "imageFormat");
        InterfaceC25774OooO0OO c25778OooO0oO = null;
        InterfaceC25775OooO0Oo interfaceC25775OooO0Oo = this.f87946OooO00o;
        InterfaceC25774OooO0OO interfaceC25774OooO0OOCreateImageTranscoder = interfaceC25775OooO0Oo != null ? interfaceC25775OooO0Oo.createImageTranscoder(imageFormat, z) : null;
        if (interfaceC25774OooO0OOCreateImageTranscoder == null) {
            Integer num = this.f87947OooO0O0;
            if (num != null) {
                if (num.intValue() == 0) {
                    c25778OooO0oO = OooO00o(imageFormat, z);
                } else {
                    if (num.intValue() != 1) {
                        throw new IllegalArgumentException("Invalid ImageTranscoderType");
                    }
                    c25778OooO0oO = new C25778OooO0oO(z);
                }
            }
            interfaceC25774OooO0OOCreateImageTranscoder = c25778OooO0oO;
        }
        if (interfaceC25774OooO0OOCreateImageTranscoder == null) {
            interfaceC25774OooO0OOCreateImageTranscoder = OooO00o(imageFormat, z);
        }
        return interfaceC25774OooO0OOCreateImageTranscoder == null ? new C25778OooO0oO(z) : interfaceC25774OooO0OOCreateImageTranscoder;
    }
}
