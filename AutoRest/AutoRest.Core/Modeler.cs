﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using Microsoft.Rest.Generator.ClientModel;

namespace Microsoft.Rest.Generator
{
    public abstract class Modeler
    {
        public abstract string Name { get; }

        public Settings Settings { get; private set; }

        protected Modeler(Settings settings)
        {
            Settings = settings;
        }

        public abstract ServiceClient Build();
    }
}
