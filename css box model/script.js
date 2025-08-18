    document.addEventListener('DOMContentLoaded', function() {
        const marginSlider = document.getElementById('margin');
        const borderSlider = document.getElementById('border');
        const paddingSlider = document.getElementById('padding');
        const layout = document.querySelector('.layout');
        const borderBox = document.querySelector('.border');
        const paddingBox = document.querySelector('.padding');
    
        const marginValue = document.getElementById('margin-value');
        const borderValue = document.getElementById('border-value');
        const paddingValue = document.getElementById('padding-value');
    
        function updateBoxModel() {
            const margin = parseInt(marginSlider.value);
            const border = parseInt(borderSlider.value);
            const padding = parseInt(paddingSlider.value);
    
            layout.style.margin = margin + 'px auto';
            borderBox.style.top = border + 'px';
            borderBox.style.left = border + 'px';
            borderBox.style.width = `calc(100% - ${2 * border}px)`;
            borderBox.style.height = `calc(100% - ${2 * border}px)`;
            borderBox.style.borderWidth = border + 'px';
    
            paddingBox.style.top = (border + padding) + 'px';
            paddingBox.style.left = (border + padding) + 'px';
            paddingBox.style.width = `calc(100% - ${2 * (border + padding)}px)`;
            paddingBox.style.height = `calc(100% - ${2 * (border + padding)}px)`;
            paddingBox.style.padding = padding + 'px';
    
            marginValue.textContent = margin + 'px';
            borderValue.textContent = border + 'px';
            paddingValue.textContent = padding + 'px';
        }
    
        marginSlider.addEventListener('input', updateBoxModel);
        borderSlider.addEventListener('input', updateBoxModel);
        paddingSlider.addEventListener('input', updateBoxModel);
    
        updateBoxModel();
    });