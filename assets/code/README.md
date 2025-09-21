# Competitive Programming Portfolio

A beautiful, modern portfolio website showcasing competitive programming solutions with interactive features.

## 🌟 Features

- **Dark/Light Theme Toggle** - Smooth theme switching with persistent storage
- **Smart Search & Filtering** - Filter by language (Python/Java) or difficulty (Easy/Medium/Hard)
- **Interactive Code Viewer** - Click any project card to view full code with syntax highlighting
- **Responsive Design** - Looks gorgeous on desktop, tablet, and mobile
- **Modern Animations** - Smooth hover effects, floating elements, and scroll animations
- **Code Highlighting** - Prism.js for beautiful syntax highlighting
- **Copy Code Feature** - One-click code copying functionality

## 📁 Project Structure

```
portfolio/
├── index.html          # Main HTML file
├── styles.css          # All styling and animations
├── script.js           # Interactive functionality
├── assets/
│   └── code/           # All your competitive programming solutions
│       ├── *.py        # Python solutions
│       └── *.java      # Java solutions
└── README.md           # This file
```

## 🚀 Deployment

### GitHub Pages

1. Push all files to a GitHub repository
2. Go to repository Settings > Pages
3. Select source as "Deploy from a branch"
4. Choose main branch and root folder
5. Your site will be available at `https://yourusername.github.io/repository-name`

### Firebase Hosting

1. Install Firebase CLI: `npm install -g firebase-tools`
2. Login: `firebase login`
3. Initialize: `firebase init hosting`
4. Build folder: select current directory (.)
5. Deploy: `firebase deploy`

### Netlify

1. Drag and drop the entire folder to netlify.com/drop
2. Or connect your GitHub repository for automatic deploys

## 📊 Portfolio Statistics

- **22 Projects** - Comprehensive collection of solutions
- **2 Languages** - Python and Java implementations
- **3 Difficulty Levels** - Easy, Medium, and Hard problems
- **Multiple Categories** - Algorithms, Math, Strings, Graphs, DP, and more

## 🛠️ Local Development

To run locally:

1. Start any HTTP server in the project directory
2. Python: `python -m http.server 8000`
3. Node.js: `npx serve .`
4. VS Code: Use Live Server extension

## 💡 Customization

### Adding New Projects

1. Add your code file to `assets/code/`
2. Update the `projects` array in `script.js` with project metadata
3. Include: title, filename, language, difficulty, description, tags, and codeFile path

### Styling Changes

- Color scheme: Edit CSS custom properties in `:root`
- Animations: Modify keyframes and transitions in `styles.css`
- Layout: Adjust grid and flexbox properties

### Functionality

- Add new filters: Update filter buttons in HTML and JavaScript
- New project categories: Extend the tags system
- Additional languages: Add language detection and highlighting

## 🎨 Technologies Used

- **HTML5** - Semantic structure and accessibility
- **CSS3** - Modern styling with custom properties and animations
- **Vanilla JavaScript** - Interactive functionality and dynamic content
- **Prism.js** - Syntax highlighting for code blocks
- **Google Fonts** - Inter and JetBrains Mono typography

## 📱 Browser Support

- Chrome/Edge: Full support
- Firefox: Full support
- Safari: Full support
- Mobile browsers: Responsive design optimized

---

Built with ❤️ for the competitive programming community!
