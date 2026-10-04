package com.microsoft.identity.common.java.commands.parameters;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.commands.parameters.TokenCommandParameters;

/* JADX INFO: loaded from: classes9.dex */
public class DeviceCodeFlowCommandParameters extends TokenCommandParameters {

    public static abstract class DeviceCodeFlowCommandParametersBuilder<C extends DeviceCodeFlowCommandParameters, B extends DeviceCodeFlowCommandParametersBuilder<C, B>> extends TokenCommandParameters.TokenCommandParametersBuilder<C, B> {
        private static void $fillValuesFromInstanceIntoBuilder(DeviceCodeFlowCommandParameters deviceCodeFlowCommandParameters, DeviceCodeFlowCommandParametersBuilder<?, ?> deviceCodeFlowCommandParametersBuilder) {
        }

        @Override // com.microsoft.identity.common.java.commands.parameters.TokenCommandParameters.TokenCommandParametersBuilder, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public abstract C build();

        @Override // com.microsoft.identity.common.java.commands.parameters.TokenCommandParameters.TokenCommandParametersBuilder, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public abstract B self();

        @Override // com.microsoft.identity.common.java.commands.parameters.TokenCommandParameters.TokenCommandParametersBuilder, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public String toString() {
            return OooO00o.OooO0OO(new StringBuilder("DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder(super="), super.toString(), ")");
        }

        @Override // com.microsoft.identity.common.java.commands.parameters.TokenCommandParameters.TokenCommandParametersBuilder
        public B $fillValuesFrom(C c) {
            super.$fillValuesFrom(c);
            $fillValuesFromInstanceIntoBuilder((DeviceCodeFlowCommandParameters) c, (DeviceCodeFlowCommandParametersBuilder<?, ?>) this);
            return (B) self();
        }
    }

    public static final class DeviceCodeFlowCommandParametersBuilderImpl extends DeviceCodeFlowCommandParametersBuilder<DeviceCodeFlowCommandParameters, DeviceCodeFlowCommandParametersBuilderImpl> {
        private DeviceCodeFlowCommandParametersBuilderImpl() {
        }

        @Override // com.microsoft.identity.common.java.commands.parameters.DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder, com.microsoft.identity.common.java.commands.parameters.TokenCommandParameters.TokenCommandParametersBuilder, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public DeviceCodeFlowCommandParametersBuilderImpl self() {
            return this;
        }

        @Override // com.microsoft.identity.common.java.commands.parameters.DeviceCodeFlowCommandParameters.DeviceCodeFlowCommandParametersBuilder, com.microsoft.identity.common.java.commands.parameters.TokenCommandParameters.TokenCommandParametersBuilder, com.microsoft.identity.common.java.commands.parameters.CommandParameters.CommandParametersBuilder
        public DeviceCodeFlowCommandParameters build() {
            return new DeviceCodeFlowCommandParameters(this);
        }
    }

    public DeviceCodeFlowCommandParameters(DeviceCodeFlowCommandParametersBuilder<?, ?> deviceCodeFlowCommandParametersBuilder) {
        super(deviceCodeFlowCommandParametersBuilder);
    }

    public static DeviceCodeFlowCommandParametersBuilder<?, ?> builder() {
        return new DeviceCodeFlowCommandParametersBuilderImpl();
    }

    @Override // com.microsoft.identity.common.java.commands.parameters.TokenCommandParameters, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public boolean canEqual(Object obj) {
        return obj instanceof DeviceCodeFlowCommandParameters;
    }

    @Override // com.microsoft.identity.common.java.commands.parameters.TokenCommandParameters, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof DeviceCodeFlowCommandParameters) && ((DeviceCodeFlowCommandParameters) obj).canEqual(this) && super.equals(obj);
    }

    @Override // com.microsoft.identity.common.java.commands.parameters.TokenCommandParameters, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.microsoft.identity.common.java.commands.parameters.TokenCommandParameters, com.microsoft.identity.common.java.commands.parameters.CommandParameters
    public DeviceCodeFlowCommandParametersBuilder<?, ?> toBuilder() {
        return new DeviceCodeFlowCommandParametersBuilderImpl().$fillValuesFrom(this);
    }
}
