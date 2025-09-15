// Project metadata - actual code will be loaded from assets folder
const projects = [
  {
    id: 1,
    title: "Currency Exchange",
    filename: "currency_exchange.py",
    language: "python",
    difficulty: "medium",
    description: "A solution for transforming gold and silver coins through exchange operations. Implements algorithmic logic to determine if target coin amounts are achievable.",
    tags: ["algorithms", "logic", "transformation"],
    codeFile: "assets/code/currency_exchange.py"
  },
  {
    id: 2,
    title: "Pizza Party Calculator",
    filename: "pizza_party.py",
    language: "python",
    difficulty: "easy",
    description: "Mathematical calculation to determine the minimum number of pizzas needed for a party based on group sizes and slice requirements.",
    tags: ["math", "optimization", "simple"],
    codeFile: "assets/code/pizza_party.py"
  },
  {
    id: 3,
    title: "All Odd Prefix Sums",
    filename: "AllOddPrefixSums.java",
    language: "java",
    difficulty: "medium",
    description: "Java solution for calculating prefix sums with odd number constraints. Demonstrates advanced array manipulation and mathematical operations.",
    tags: ["arrays", "prefix-sums", "mathematics"],
    codeFile: "assets/code/AllOddPrefixSums.java"
  },
  {
    id: 4,
    title: "Bigger is Better",
    filename: "bigger_is_better.py",
    language: "python",
    difficulty: "medium",
    description: "Optimization problem focusing on maximizing values through strategic selection and sorting algorithms.",
    tags: ["sorting", "optimization", "greedy"],
    codeFile: "assets/code/bigger_is_better.py"
  },
  {
    id: 5,
    title: "Bowling Balls",
    filename: "bowling_balls.java",
    language: "java",
    difficulty: "easy",
    description: "Simple problem involving counting and basic arithmetic operations with bowling ball arrangements.",
    tags: ["counting", "basic-math", "simulation"],
    codeFile: "assets/code/bowling_balls.java"
  },
  {
    id: 6,
    title: "Create Binary String",
    filename: "create_binary_string.py",
    language: "python",
    difficulty: "medium",
    description: "String manipulation and binary operations to create valid binary strings based on given constraints.",
    tags: ["strings", "binary", "construction"],
    codeFile: "assets/code/create_binary_string.py"
  },
  {
    id: 7,
    title: "Decoration Discount",
    filename: "decoration_discount.py",
    language: "python",
    difficulty: "easy",
    description: "Cost optimization problem for calculating maximum discount on decorative items with budget constraints.",
    tags: ["optimization", "cost-calculation", "simple"],
    codeFile: "assets/code/decoration_discount.py"
  },
  {
    id: 8,
    title: "Deletion and Difference",
    filename: "deletion_and_differnce.py",
    language: "python",
    difficulty: "medium",
    description: "Array manipulation problem involving element deletion to minimize difference between elements.",
    tags: ["arrays", "optimization", "difference"],
    codeFile: "assets/code/deletion_and_differnce.py"
  },
  {
    id: 9,
    title: "Easy Pronunciation",
    filename: "easy_pronunciation.py",
    language: "python",
    difficulty: "easy",
    description: "String processing problem to determine if words are easy to pronounce based on consonant and vowel patterns.",
    tags: ["strings", "pattern-matching", "simple"],
    codeFile: "assets/code/easy_pronunciation.py"
  },
  {
    id: 10,
    title: "Food Balance",
    filename: "food_balance.py",
    language: "python",
    difficulty: "medium",
    description: "Optimization problem for balancing food distribution with nutritional constraints and cost considerations.",
    tags: ["optimization", "dynamic-programming", "mathematics"],
    codeFile: "assets/code/food_balance.py"
  },
  {
    id: 11,
    title: "Homework Helper",
    filename: "homework.py",
    language: "python",
    difficulty: "easy",
    description: "Simple problem-solving algorithm to help with homework calculations and basic mathematical operations.",
    tags: ["mathematics", "basic-algorithms", "simple"],
    codeFile: "assets/code/homework.py"
  },
  {
    id: 12,
    title: "Independence Day",
    filename: "independence_day.java",
    language: "java",
    difficulty: "hard",
    description: "Complex algorithmic problem involving graph theory or advanced data structures for Independence Day celebrations.",
    tags: ["graphs", "complex-algorithms", "advanced"],
    codeFile: "assets/code/independence_day.java"
  },
  {
    id: 13,
    title: "Minimum Colors Easy",
    filename: "minimum_colors_easy.py",
    language: "python",
    difficulty: "easy",
    description: "Graph coloring or combinatorial problem to find the minimum number of colors needed for a given constraint.",
    tags: ["graph-theory", "combinatorics", "greedy"],
    codeFile: "assets/code/minimum_colors_easy.py"
  },
  {
    id: 14,
    title: "Number Walks",
    filename: "number_walks.py",
    language: "python",
    difficulty: "medium",
    description: "Dynamic programming problem involving counting the number of valid walks or paths in a mathematical structure.",
    tags: ["dynamic-programming", "counting", "paths"],
    codeFile: "assets/code/number_walks.py"
  },
  {
    id: 15,
    title: "Nutrition Cost",
    filename: "nutrition_cost.py",
    language: "python",
    difficulty: "medium",
    description: "Cost optimization problem for calculating nutritional value while minimizing expenses in meal planning.",
    tags: ["optimization", "cost-analysis", "nutrition"],
    codeFile: "assets/code/nutrition_cost.py"
  },
  {
    id: 16,
    title: "Palindrome Number",
    filename: "palindrome_number.java",
    language: "java",
    difficulty: "easy",
    description: "Classic problem to check if a number is a palindrome, demonstrating basic number manipulation techniques.",
    tags: ["palindrome", "numbers", "basic"],
    codeFile: "assets/code/palindrome_number.java"
  },
  {
    id: 17,
    title: "Placing 01 and 10",
    filename: "placing_01_and_10.py",
    language: "python",
    difficulty: "medium",
    description: "String construction problem involving strategic placement of binary patterns to satisfy given constraints.",
    tags: ["strings", "binary", "construction"],
    codeFile: "assets/code/placing_01_and_10.py"
  },
  {
    id: 18,
    title: "The Cunning Seller",
    filename: "the_cunning_seller.py",
    language: "python",
    difficulty: "medium",
    description: "Game theory or optimization problem involving a seller trying to maximize profit through strategic pricing.",
    tags: ["game-theory", "optimization", "strategy"],
    codeFile: "assets/code/the_cunning_seller.py"
  },
  {
    id: 19,
    title: "The Cunning Seller Hard",
    filename: "the_cunning_seller_hard.py",
    language: "python",
    difficulty: "hard",
    description: "Advanced version of the cunning seller problem with additional constraints and complex optimization requirements.",
    tags: ["advanced-optimization", "complex-algorithms", "game-theory"],
    codeFile: "assets/code/the_cunning_seller_hard.py"
  },
  {
    id: 20,
    title: "The Secret Number",
    filename: "the_secret_number.py",
    language: "python",
    difficulty: "medium",
    description: "Number theory problem involving mathematical deduction to find hidden numbers based on given clues.",
    tags: ["number-theory", "mathematics", "deduction"],
    codeFile: "assets/code/the_secret_number.py"
  },
  {
    id: 21,
    title: "Too Much Homework",
    filename: "too_much_homework.py",
    language: "python",
    difficulty: "easy",
    description: "Time management problem to optimize homework completion within given time constraints.",
    tags: ["time-optimization", "scheduling", "simple"],
    codeFile: "assets/code/too_much_homework.py"
  },
  {
    id: 22,
    title: "Young Physicist",
    filename: "YoungPhysicist.java",
    language: "java",
    difficulty: "easy",
    description: "Physics-based problem involving vector calculations and equilibrium conditions in a 3D space.",
    tags: ["physics", "vectors", "mathematics"],
    codeFile: "assets/code/YoungPhysicist.java"
  },
];

// DOM Elements
const themeToggle = document.getElementById('theme-toggle');
const filterButtons = document.querySelectorAll('.filter-btn');
const searchInput = document.getElementById('search-input');
const projectsGrid = document.getElementById('projects-grid');
const modal = document.getElementById('project-modal');
const modalClose = document.getElementById('modal-close');
const copyBtn = document.getElementById('copy-btn');

// State
let currentFilter = 'all';
let searchQuery = '';
let currentProjects = projects;

// Theme Management
function initTheme() {
  const savedTheme = localStorage.getItem('theme') || 'light';
  document.documentElement.setAttribute('data-theme', savedTheme);
  updateThemeIcon(savedTheme);
}

function toggleTheme() {
  const currentTheme = document.documentElement.getAttribute('data-theme') || 'light';
  const newTheme = currentTheme === 'light' ? 'dark' : 'light';
  
  document.documentElement.setAttribute('data-theme', newTheme);
  localStorage.setItem('theme', newTheme);
  updateThemeIcon(newTheme);
}

function updateThemeIcon(theme) {
  const themeIcon = document.querySelector('.theme-icon');
  themeIcon.textContent = theme === 'light' ? '🌙' : '☀️';
}

// Code loading cache
const codeCache = new Map();

// Load code from file
async function loadCode(codeFile) {
  if (codeCache.has(codeFile)) {
    return codeCache.get(codeFile);
  }
  
  try {
    const response = await fetch(codeFile);
    if (!response.ok) {
      throw new Error(`Failed to load ${codeFile}`);
    }
    const code = await response.text();
    codeCache.set(codeFile, code);
    return code;
  } catch (error) {
    console.error('Error loading code:', error);
    return `// Error loading code from ${codeFile}
// Please check if the file exists in the assets/code directory`;
  }
}

// Project Rendering
function createProjectCard(project) {
  const difficultyClass = project.difficulty;
  const languageColor = project.language === 'python' ? '#3776ab' : '#f89820';
  
  return `
    <div class="project-card" data-language="${project.language}" data-difficulty="${project.difficulty}" data-id="${project.id}">
      <div class="project-header">
        <h3 class="project-title">${project.title}</h3>
        <div class="project-meta">
          <span class="project-language" style="background-color: ${languageColor}">
            ${project.language.toUpperCase()}
          </span>
          <span class="project-difficulty ${difficultyClass}">
            ${project.difficulty.toUpperCase()}
          </span>
        </div>
        <p class="project-description">${project.description}</p>
      </div>
      <div class="project-code">
        <div class="code-preview">
          <div class="loading-placeholder">Loading code preview...</div>
        </div>
      </div>
    </div>
  `;
}

function renderProjects(projectsToRender = currentProjects) {
  const html = projectsToRender.map(createProjectCard).join('');
  projectsGrid.innerHTML = html;
  
  // Add click listeners to project cards
  document.querySelectorAll('.project-card').forEach(async (card) => {
    const projectId = parseInt(card.dataset.id);
    const project = projects.find(p => p.id === projectId);
    
    // Load code preview
    if (project && project.codeFile) {
      const codePreview = card.querySelector('.code-preview');
      try {
        const code = await loadCode(project.codeFile);
        const previewLines = code.split('\n').slice(0, 6);
        const preview = previewLines.join('\n') + (code.split('\n').length > 6 ? '\n...' : '');
        codePreview.innerHTML = `<pre><code>${preview}</code></pre>`;
      } catch (error) {
        codePreview.innerHTML = '<div class="error-placeholder">Error loading preview</div>';
      }
    }
    
    card.addEventListener('click', () => {
      openProjectModal(projectId);
    });
  });
}

// Filtering and Search
function filterProjects() {
  let filtered = projects;
  
  // Apply language/difficulty filter
  if (currentFilter !== 'all') {
    filtered = filtered.filter(project => 
      project.language === currentFilter || project.difficulty === currentFilter
    );
  }
  
  // Apply search filter
  if (searchQuery) {
    const query = searchQuery.toLowerCase();
    filtered = filtered.filter(project => 
      project.title.toLowerCase().includes(query) ||
      project.description.toLowerCase().includes(query) ||
      project.tags.some(tag => tag.toLowerCase().includes(query))
    );
  }
  
  currentProjects = filtered;
  renderProjects();
  
  // Show no results message if needed
  if (filtered.length === 0) {
    projectsGrid.innerHTML = `
      <div style="grid-column: 1 / -1; text-align: center; padding: 4rem; color: var(--text-muted);">
        <h3>No projects found</h3>
        <p>Try adjusting your filters or search terms.</p>
      </div>
    `;
  }
}

// Modal Management
async function openProjectModal(projectId) {
  const project = projects.find(p => p.id === projectId);
  if (!project) return;
  
  // Populate modal content
  document.getElementById('modal-title').textContent = project.title;
  document.getElementById('modal-language').textContent = project.language.toUpperCase();
  document.getElementById('modal-language').style.backgroundColor = 
    project.language === 'python' ? '#3776ab' : '#f89820';
  
  const difficultyEl = document.getElementById('modal-difficulty');
  difficultyEl.textContent = project.difficulty.toUpperCase();
  difficultyEl.className = `modal-difficulty ${project.difficulty}`;
  
  document.getElementById('modal-description').textContent = project.description;
  document.getElementById('modal-filename').textContent = project.filename;
  
  const codeContent = document.getElementById('modal-code-content');
  codeContent.textContent = 'Loading code...';
  
  // Show modal first
  modal.classList.add('active');
  document.body.style.overflow = 'hidden';
  
  // Load code asynchronously
  try {
    const code = await loadCode(project.codeFile);
    codeContent.textContent = code;
    codeContent.className = `language-${project.language}`;
    
    // Re-highlight code
    if (window.Prism) {
      Prism.highlightElement(codeContent);
    }
  } catch (error) {
    codeContent.textContent = `// Error loading ${project.filename}
// Please check if the file exists in assets/code/`;
  }
}

function closeProjectModal() {
  modal.classList.remove('active');
  document.body.style.overflow = '';
}

// Copy Code Functionality
async function copyCode() {
  const codeContent = document.getElementById('modal-code-content').textContent;
  
  try {
    await navigator.clipboard.writeText(codeContent);
    
    // Visual feedback
    const originalText = copyBtn.textContent;
    copyBtn.textContent = 'Copied!';
    copyBtn.style.backgroundColor = '#10b981';
    
    setTimeout(() => {
      copyBtn.textContent = originalText;
      copyBtn.style.backgroundColor = '';
    }, 2000);
    
  } catch (err) {
    console.error('Failed to copy code:', err);
    // Fallback for older browsers
    const textArea = document.createElement('textarea');
    textArea.value = codeContent;
    document.body.appendChild(textArea);
    textArea.select();
    document.execCommand('copy');
    document.body.removeChild(textArea);
    
    copyBtn.textContent = 'Copied!';
    setTimeout(() => copyBtn.textContent = 'Copy Code', 2000);
  }
}

// Statistics Update
function updateStatistics() {
  const pythonCount = projects.filter(p => p.language === 'python').length;
  const javaCount = projects.filter(p => p.language === 'java').length;
  
  document.getElementById('total-projects').textContent = projects.length;
  document.getElementById('python-count').textContent = pythonCount;
  document.getElementById('java-count').textContent = javaCount;
}

// Animations
function animateNumbers() {
  const numberElements = document.querySelectorAll('.stat-number');
  
  numberElements.forEach(el => {
    const target = parseInt(el.textContent);
    if (isNaN(target)) return;
    
    let current = 0;
    const increment = target / 30;
    const timer = setInterval(() => {
      current += increment;
      if (current >= target) {
        current = target;
        clearInterval(timer);
      }
      el.textContent = Math.floor(current);
    }, 50);
  });
}

// Intersection Observer for animations
function setupScrollAnimations() {
  const observerOptions = {
    threshold: 0.1,
    rootMargin: '0px 0px -50px 0px'
  };
  
  const observer = new IntersectionObserver((entries) => {
    entries.forEach(entry => {
      if (entry.isIntersecting) {
        entry.target.style.opacity = '1';
        entry.target.style.transform = 'translateY(0)';
        
        // Trigger number animation for stats
        if (entry.target.classList.contains('stats-section')) {
          animateNumbers();
        }
      }
    });
  }, observerOptions);
  
  // Observe project cards and sections
  document.querySelectorAll('.project-card, .stats-section, .stat-card').forEach(el => {
    el.style.opacity = '0';
    el.style.transform = 'translateY(20px)';
    el.style.transition = 'opacity 0.6s ease, transform 0.6s ease';
    observer.observe(el);
  });
}

// Event Listeners
function setupEventListeners() {
  // Theme toggle
  themeToggle.addEventListener('click', toggleTheme);
  
  // Filter buttons
  filterButtons.forEach(btn => {
    btn.addEventListener('click', () => {
      filterButtons.forEach(b => b.classList.remove('active'));
      btn.classList.add('active');
      currentFilter = btn.dataset.filter;
      filterProjects();
    });
  });
  
  // Search input
  searchInput.addEventListener('input', (e) => {
    searchQuery = e.target.value;
    filterProjects();
  });
  
  // Modal controls
  modalClose.addEventListener('click', closeProjectModal);
  modal.addEventListener('click', (e) => {
    if (e.target === modal) {
      closeProjectModal();
    }
  });
  
  // Copy button
  copyBtn.addEventListener('click', copyCode);
  
  // Keyboard shortcuts
  document.addEventListener('keydown', (e) => {
    if (e.key === 'Escape' && modal.classList.contains('active')) {
      closeProjectModal();
    }
  });
  
  // Smooth scrolling for navigation links
  document.querySelectorAll('a[href^="#"]').forEach(link => {
    link.addEventListener('click', (e) => {
      e.preventDefault();
      const target = document.querySelector(link.getAttribute('href'));
      if (target) {
        target.scrollIntoView({ behavior: 'smooth' });
      }
    });
  });
}

// Header scroll effect
function setupHeaderScroll() {
  let lastScrollY = window.scrollY;
  
  window.addEventListener('scroll', () => {
    const header = document.querySelector('.header');
    const scrollY = window.scrollY;
    
    if (scrollY > 100) {
      header.style.background = 'rgba(255, 255, 255, 0.95)';
      if (document.documentElement.getAttribute('data-theme') === 'dark') {
        header.style.background = 'rgba(17, 24, 39, 0.95)';
      }
    } else {
      header.style.background = 'rgba(255, 255, 255, 0.8)';
      if (document.documentElement.getAttribute('data-theme') === 'dark') {
        header.style.background = 'rgba(17, 24, 39, 0.8)';
      }
    }
    
    lastScrollY = scrollY;
  });
}

// Initialize everything
function init() {
  initTheme();
  renderProjects();
  updateStatistics();
  setupEventListeners();
  setupScrollAnimations();
  setupHeaderScroll();
  
  // Add loading animation
  setTimeout(() => {
    document.body.style.opacity = '1';
  }, 100);
}

// Add initial loading state
document.body.style.opacity = '0';
document.body.style.transition = 'opacity 0.5s ease';

// Start the app
if (document.readyState === 'loading') {
  document.addEventListener('DOMContentLoaded', init);
} else {
  init();
}