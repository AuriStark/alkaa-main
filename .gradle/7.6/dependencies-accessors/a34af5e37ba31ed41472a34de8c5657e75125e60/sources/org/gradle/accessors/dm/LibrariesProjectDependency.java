package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.ProjectDependency;
import org.gradle.api.internal.artifacts.dependencies.ProjectDependencyInternal;
import org.gradle.api.internal.artifacts.DefaultProjectDependencyFactory;
import org.gradle.api.internal.artifacts.dsl.dependencies.ProjectFinder;
import org.gradle.api.internal.catalog.DelegatingProjectDependency;
import org.gradle.api.internal.catalog.TypeSafeProjectDependencyFactory;
import javax.inject.Inject;

@NonNullApi
public class LibrariesProjectDependency extends DelegatingProjectDependency {

    @Inject
    public LibrariesProjectDependency(TypeSafeProjectDependencyFactory factory, ProjectDependencyInternal delegate) {
        super(factory, delegate);
    }

    /**
     * Creates a project dependency on the project at path ":libraries:core"
     */
    public Libraries_CoreProjectDependency getCore() { return new Libraries_CoreProjectDependency(getFactory(), create(":libraries:core")); }

    /**
     * Creates a project dependency on the project at path ":libraries:designsystem"
     */
    public Libraries_DesignsystemProjectDependency getDesignsystem() { return new Libraries_DesignsystemProjectDependency(getFactory(), create(":libraries:designsystem")); }

    /**
     * Creates a project dependency on the project at path ":libraries:navigation"
     */
    public Libraries_NavigationProjectDependency getNavigation() { return new Libraries_NavigationProjectDependency(getFactory(), create(":libraries:navigation")); }

    /**
     * Creates a project dependency on the project at path ":libraries:splitInstall"
     */
    public Libraries_SplitInstallProjectDependency getSplitInstall() { return new Libraries_SplitInstallProjectDependency(getFactory(), create(":libraries:splitInstall")); }

    /**
     * Creates a project dependency on the project at path ":libraries:test"
     */
    public Libraries_TestProjectDependency getTest() { return new Libraries_TestProjectDependency(getFactory(), create(":libraries:test")); }

}
